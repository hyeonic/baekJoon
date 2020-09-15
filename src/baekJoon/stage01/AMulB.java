package baekJoon.stage01;

import java.util.Scanner;

// 1-7 10998 A x B
public class AMulB {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.print(num1 * num2);

        sc.close();
    }
}
