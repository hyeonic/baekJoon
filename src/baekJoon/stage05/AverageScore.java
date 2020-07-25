package baekJoon.stage05;

import java.util.Scanner;

// 10039
public class AverageScore {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int result = 0;
		int n;
		int i = 0;

		while (sc.hasNextInt()) {
			n = sc.nextInt();
			if (n >= 0 && n <= 100) {
				if (n < 40)
					n = 40;

				result += n;
				++i;
			}
		}
		System.out.println(result/i);

		sc.close();
	}
}
