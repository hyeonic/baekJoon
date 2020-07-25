package baekJoon.stage04;

import java.util.Scanner;


// 추가적인 확인이 필요하다.
// 10951
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
