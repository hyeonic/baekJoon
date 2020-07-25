package baekJoon.stage03;

import java.util.Scanner;

// 2742
public class StampingN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i = n; i > 0; --i) {
			System.out.println(i);
		}

		sc.close();
	}
}
