package baekJoon.stage05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 5543
public class Lunch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> buggerPrice = new ArrayList();
		ArrayList<Integer> drinkPrice = new ArrayList();

		for (int i = 0; i < 3; ++i) {
			buggerPrice.add(sc.nextInt());
		}

		for (int i = 0; i < 2; ++i) {
			drinkPrice.add(sc.nextInt());
		}

		int result = Collections.min(buggerPrice) + Collections.min(drinkPrice) - 50;
		System.out.println(result);

	}

}
