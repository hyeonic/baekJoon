package baekJoon.stage01;

import java.util.Scanner;

// 1-9 10430 나머지
public class Remainder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		System.out.println((a + b) % c);
		System.out.println(((a % c) + (b % c)) % c);
		System.out.println((a * b) % c);
		System.out.println(((a % c) * (b % c)) % c);

		sc.close();
	}
}
