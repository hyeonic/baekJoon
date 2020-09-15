package baekJoon.stage01;

import java.util.Scanner;

// 1-9 10869 사칙연산
public class FourPointOperation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        sc.close();
    }

}
