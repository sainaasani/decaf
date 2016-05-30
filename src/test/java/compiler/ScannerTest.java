package compiler;

import org.junit.Test;

import java.io.IOException;

/**
 * Created by Majid Vaghari on 4/3/2016.
 */
public class ScannerTest {
    @Test
    public void sample() throws IOException {
        Scanner scanner = new Scanner("src/test/resources/sampleinput.decaf");
        String  token   = null;
        do {
            try {
                token = scanner.NextToken();
                System.out.println(token != null ? token : "");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (token != null);
    }

    @Test
    public void keywords() throws IOException {
        Scanner scanner = new Scanner("src/test/resources/keywords.decaf");
        String  token   = null;
        do {
            try {
                token = scanner.NextToken();
                System.out.println(token != null ? token : "");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (token != null);
    }

    @Test
    public void errorTest() throws IOException {
        Scanner scanner = new Scanner("src/test/resources/error.decaf");
        String  token   = null;
        do {
            try {
                token = scanner.NextToken();
                System.out.println(token != null ? token : "");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (token != null);
    }

    @Test
    public void testCases() throws IOException {
        for (int i = 0; i < 7; i++)
            testCases(i + 1);
    }

    private void testCases(int testNum) throws IOException {
        Scanner scanner = new Scanner("src/test/resources/" + testNum + ".l");
        String  token   = null;
        do {
            try {
                token = scanner.NextToken();
                System.out.println(token != null ? token : "");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (token != null);
    }
}
