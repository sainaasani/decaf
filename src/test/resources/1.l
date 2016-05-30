int l;

void l1() {
	return ;
}

void l2()
{
	l1();
}

void l3() {
	l2();
}

void f () {
	writeint l;
	l = l - 1;
	if (l > 0) { f(); }
}

void main() {
	l = 10;
	f();
	l3();
}
