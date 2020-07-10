package baekJoon.stage3;

import java.util.Scanner;

// 2439
public class StarStampingTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if ( n >= 1 && n <= 100) {
			for (int i = 1; i <= n; ++i) {
				for (int j = n - i; j > 0 ; --j) {
					System.out.print(" ");
				}

				for (int j = i; j > 0 ; --j) {
					System.out.print("*");
				}

				System.out.println("");
			}
		}

		sc.close();
	}
}
