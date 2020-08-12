package baekJoon.stage01;

import java.util.Scanner;

// 1-8 1008 A / B
public class ADivB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double num1;
		double num2;

		num1 = sc.nextDouble();
		num2 = sc.nextDouble();

		System.out.print(num1 / num2);
		
		sc.close();
	}
}
