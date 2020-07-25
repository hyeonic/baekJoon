package baekJoon.stage02;

import java.util.Scanner;

// 2884
public class Alarm {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int h; // 시
		int m; // 분
		int result = 0;

		h = scanner.nextInt();
		m = scanner.nextInt();

		if (h >= 0 && h <= 23 && m >= 0 && m <= 59) {
			result = h * 60 + m;

			if (result < 60)
				result = 24 * 60 + m;

			result = result - 45;
		}

		System.out.print( (result/60 == 24 ? 0 : result/60) + " " + result%60 );

	}
}
