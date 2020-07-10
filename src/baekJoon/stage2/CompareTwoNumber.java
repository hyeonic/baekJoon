package baekJoon.stage2;

import java.util.Scanner;

public class CompareTwoNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a;
		int b;

		a = scanner.nextInt();
		b = scanner.nextInt();

		if (a >= -10000 && a <= 10000 && b >= -10000 && b <= 10000) {
			if (a > b)
				System.out.println(">");
			else if (a < b)
				System.out.println("<");
			else
				System.out.println("==");
		}
	}
}
