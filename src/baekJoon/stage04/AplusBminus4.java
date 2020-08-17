package baekJoon.stage04;

import java.util.Scanner;

// 4-2 10951 A + B - 4
public class AplusBminus4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(a + b);
		}
		sc.close();
	}
}
