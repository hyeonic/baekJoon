package baekJoon.stage6;

import java.util.ArrayList;
import java.util.Scanner;

// 3052
public class Remainder {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList();
		int n;

		while (sc.hasNextInt()) {
			n = sc.nextInt();
			if ( n < 1000 & n > 0 ) {
				if (list.indexOf(n%42) == -1) {
					list.add(n%42);
				}
			}
		}

		System.out.println(list.size());

	}
}
