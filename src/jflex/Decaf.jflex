
package compiler;
import java.util.HashSet;
import java.util.ArrayList;
import model.*;
%%

%public
%class Scanner
%final

%unicode

%line
%column
%type Token
%function nextToken
%{
    private HashSet<Identifier> CV = new HashSet<>();
    private Scanner includedFile;
    private java.io.File file;
%}
%{
    public String NextToken() throws java.io.IOException {
            if (includedFile != null) {
                String t = includedFile.NextToken();
                if (t != null)
                    return t;
                else
                    includedFile = null;
            }

            Token t = nextToken();

            if (t instanceof Identifier)
                return "id";
            if (t instanceof BooleanLiteral)
                return "bool_literal";
            if (t instanceof CharacterLiteral)
                return "char_literal";
            if (t instanceof FloatLiteral)
                return "float_literal";
            if (t instanceof IntegerLiteral)
                return "int_literal";

            if (t instanceof PreprocessorDirective) {
                includedFile = new Scanner(new java.io.File(file.getParent(), t.getValue()).getCanonicalPath());
                String token = includedFile.NextToken();
                if (token != null)
                    return token;
                else
                    includedFile = null;
            }

            return t != null ? t.getValue() : null;
    }
%}

/* main character classes */
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} 
TraditionalComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}?
WhiteSpace = {LineTerminator} | [ \t\f] | {Comment}

/* identifiers */
alpha = [a-zA-Z_]  
digit = [0-9]
alpha_num = {alpha}|{digit}
id = {alpha}{alpha_num}*
hex_digit = {digit}|[a-fA-F]
decimal_literal = {digit}+
hex_literal = 0 [xX] {hex_digit}+
int_literal = {decimal_literal}|{hex_literal}
/* includedFile =  "\\#includes" {WhiteSpace} {InputCharacter} {LineTerminator} */
/* floating point literals */        
float_literal  = {decimal_literal}"."{decimal_literal} | "."{decimal_literal} | {decimal_literal}"."
fileName = {InputCharacter}* {LineTerminator}
/* string and character literals */
SingleCharacter = [^\r\n\'\\]

%state STRING, CHARLITERAL, INCLUDE

%%

<YYINITIAL> {

  /* keywords */
  "boolean"                      { return new Keyword(Keywords.BOOLEAN,yyline,yycolumn); }
  "break"                        { return new Keyword(Keywords.BREAK,yyline,yycolumn); }
  "char"                         { return new Keyword(Keywords.CHAR,yyline,yycolumn); }
  "continue"                     { return new Keyword(Keywords.CONTINUE,yyline,yycolumn); }
  "else"                         { return new Keyword(Keywords.ELSE,yyline,yycolumn); }
  "false"                        { return new BooleanLiteral("false",yyline,yycolumn);}
  "float"                        { return new Keyword(Keywords.FLOAT,yyline,yycolumn); }
  "for"                          { return new Keyword(Keywords.FOR,yyline,yycolumn); }
  "if"                           { return new Keyword(Keywords.IF,yyline,yycolumn); }
  "int"                          { return new Keyword(Keywords.INT,yyline,yycolumn); }
  "readchar"                     { return new Keyword(Keywords.READCHAR,yyline,yycolumn); }
  "readfloat"                    { return new Keyword(Keywords.READFLOAT,yyline,yycolumn); }
  "readint"                      { return new Keyword(Keywords.READINT,yyline,yycolumn); }
  "return"                       { return new Keyword(Keywords.RETURN,yyline,yycolumn); }
  "true"                         { return new BooleanLiteral("true",yyline,yycolumn);}
  "void"                         { return new Keyword(Keywords.VOID, yyline, yycolumn); }
  "while"                        { return new Keyword(Keywords.WHILE, yyline, yycolumn); }
  "writechar"                    { return new Keyword(Keywords.WRITECHAR, yyline, yycolumn);}
  "writefloat"                   { return new Keyword(Keywords.WRITEFLOAT, yyline, yycolumn);}
  "writeint"                     { return new Keyword(Keywords.WRITEINT, yyline, yycolumn);}
  
  /* separators */
  "("                            { return new Symbol(Symbols.LPAREN,yyline, yycolumn); }
  ")"                            { return new Symbol(Symbols.RPAREN,yyline, yycolumn); }
  "{"                            { return new Symbol(Symbols.LBRACE,yyline, yycolumn); }
  "}"                            { return new Symbol(Symbols.RBRACE,yyline, yycolumn); }
  ";"                            { return new Symbol(Symbols.SEMICOLON ,yyline, yycolumn); }
  ","                            { return new Symbol(Symbols.COMMA, yyline, yycolumn); }
  "["                            { return new Symbol(Symbols.LBRACKET,yyline,yycolumn);}
  "]"                            { return new Symbol(Symbols.RBRACKET,yyline,yycolumn);}
  
  /* operators */
  "="                            { return new Symbol(Symbols.EQ,yyline, yycolumn);}
  "-"                            { return new Symbol(Symbols.MINUS,yyline, yycolumn); }
  "!"                            { return new Symbol(Symbols.NOT,yyline, yycolumn); }
  "*"                            { return new Symbol(Symbols.MULT,yyline, yycolumn); }
  "/"                            { return new Symbol(Symbols.DIV,yyline, yycolumn ); }
  "%"                            { return new Symbol(Symbols.MOD,yyline, yycolumn); }
  "+"                            { return new Symbol(Symbols.PLUS,yyline, yycolumn); }
  ">"                            { return new Symbol(Symbols.GT,yyline, yycolumn); }
  "<"                            { return new Symbol(Symbols.LT,yyline, yycolumn); }
  "<="                           { return new Symbol(Symbols.LTEQ,yyline, yycolumn); }
  ">="                           { return new Symbol(Symbols.GTEQ,yyline, yycolumn ); }
  "=="                           { return new Symbol(Symbols.EQEQ,yyline, yycolumn); }
  "!="                           { return new Symbol(Symbols.NOTEQ,yyline, yycolumn); }
  "&&"                           { return new Symbol(Symbols.ANDAND,yyline, yycolumn); }
  "||"                           { return new Symbol(Symbols.OROR,yyline, yycolumn); }

  /* character literal */
  \'                             { yybegin(CHARLITERAL); }

  /* numeric literals */        
  {int_literal}                   { return new IntegerLiteral (yytext(), yyline, yycolumn ); }
  {float_literal}                 { return new FloatLiteral (yytext(), yyline, yycolumn); }
  /* whitespace */
  {WhiteSpace}                   { /* ignore */ }
  /* identifiers */ 
  
  \\#includes {WhiteSpace}         { yybegin(INCLUDE); }

    
  {id}                           {  
                                    Identifier id1 = new Identifier(yytext(),yyline,yycolumn);
                                    CV.add(id1);
                                    return id1; }  
}
<CHARLITERAL> {
  {SingleCharacter}\'            { yybegin(YYINITIAL); return new CharacterLiteral( yytext(), yyline, yycolumn); }
  
  /* escape sequences */
  
  "\\'"\'                        { yybegin(YYINITIAL); return new CharacterLiteral("\'", yyline, yycolumn);}
  "\\t"\'                        { yybegin(YYINITIAL); return new CharacterLiteral( "\t", yyline, yycolumn);}
  "\\n"\'                        { yybegin(YYINITIAL); return new CharacterLiteral( "\n", yyline, yycolumn);}
  "\\\\"\'                       { yybegin(YYINITIAL); return new CharacterLiteral( "\\", yyline, yycolumn);}
/* error */
 \\.                            { throw new RuntimeException("Invalid Token at line " + yyline + " = " + yytext()); }
{LineTerminator}                 {throw new RuntimeException ("Invalid Token at line " + yyline + " = (newline)"); }

}
<INCLUDE> {
    {fileName}                   { yybegin(YYINITIAL); return new PreprocessorDirective(yytext().trim(), yyline,
    yycolumn); }
}

[^]                              { throw new RuntimeException("Invalid Token at line " + yyline + " = " + yytext()); }
