package baekJoon.stage03;

import java.util.Scanner;

// 3-9 2438 별찍기 - 1
public class StarStampingOne {

    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        int star = a.nextInt();

        for (int i = 1; i < star + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
