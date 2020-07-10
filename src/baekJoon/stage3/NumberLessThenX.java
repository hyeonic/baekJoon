package baekJoon.stage3;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberLessThenX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] n;
		int x;
		ArrayList<Integer> result = new ArrayList();

		n = new int[sc.nextInt()];
		x = sc.nextInt();

		if ( n.length >= 1 && x <= 10000) {

			for (int i = 0; i < n.length; ++i) {
				n[i] = sc.nextInt();
				if (x > n[i])
					result.add(n[i]);
			}

			for (int i = 0; i < result.size(); ++i) {
				System.out.print(result.get(i) + " ");
			}
		}

		sc.close();
	}

}
