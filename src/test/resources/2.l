void main() {
	int i;
	i = 6;
	while (true) {
		writeint i;
		writechar '\n';
		if (i >= 30) { break; }
		if (i % 3 != 0) { i = i + 1; continue; }
		int j; j = 0;
		while (true) {
			j = j + 1;
			writeint i * 100 + j;
			if (j == 5) { break; }
			else { writechar '\n'; }
		}
		writechar '\n';
		i = i + 1;
	}
}
