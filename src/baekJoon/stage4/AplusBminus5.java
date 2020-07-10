package baekJoon.stage4;

import java.util.ArrayList;
import java.util.Scanner;

public class AplusBminus5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 1;
		int b = 1;
		ArrayList<Integer> result = new ArrayList<>();


		while (a != 0 && b != 0) {
			a = sc.nextInt();
			b = sc.nextInt();

			result.add(a + b);
		}

		int i = 0;
		while (result.size() - 1 > i) {
			System.out.println(result.get(i++));
		}

		sc.close();
	}
}
