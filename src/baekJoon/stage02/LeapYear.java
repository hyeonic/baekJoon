package baekJoon.stage02;

import java.util.Scanner;

// 2-3 2753 윤년
public class LeapYear {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);

		int leapYear = a.nextInt();


		if ((leapYear % 4 == 0 && leapYear % 100 != 0) || leapYear % 400 == 0 ) {
			System.out.println('1');
		}else {
			System.out.println('0');
		}
	}
}
