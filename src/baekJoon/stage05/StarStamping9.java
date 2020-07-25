package baekJoon.stage05;

import java.util.Scanner;

// 2446
public class StarStamping9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = (2 * n - 1);
		int[] star = new int[ 2 * n - 1 ];

		if (n >= 1 && n <= 100) {
			for (int i = 0; i < (2 * n - 1); ++i) {
				if (i < n - 1) {
					star[i] = count;
					count -= 2;
				}else {
					star[i] = count;
					count += 2;
				}
			}

			for (int i = 0; i < 2*n-1; ++i) {
				for (int j = 0; j < (2*n-1) - star[i] - 1; j = j + 2) {
					System.out.print(" ");
				}

				for (int j = 0; j < star[i]; ++j) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}

		sc.close();
	}
}
