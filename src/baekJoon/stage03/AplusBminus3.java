package baekJoon.stage03;

import java.util.Scanner;

public class AplusBminus3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n;
		int a;
		int b;
		int[] result;

		n = scanner.nextInt();
		result = new int[n];

		for (int i = 0; i < n; ++i) {
			a = scanner.nextInt();
			b = scanner.nextInt();

			result[i] = a + b;
		}

		for (int i = 0; i < n; ++i) {
			System.out.println(result[i]);
		}
	}
}
