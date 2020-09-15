package baekJoon.stage05;

import java.util.Scanner;

// 2523
public class StarStamping13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 1;
        int[] star = new int[2 * n - 1];

        if (n >= 1 && n <= 100) {
            for (int i = 0; i < 2 * n - 1; ++i) {
                if (i < n - 1) {
                    star[i] = count++;
                } else {
                    star[i] = count--;
                }
            }

            for (int i = 0; i < 2 * n - 1; ++i) {
                for (int j = 0; j < star[i]; ++j) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
