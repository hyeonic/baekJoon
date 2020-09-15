package baekJoon.stage05;

import java.util.Scanner;

// 10996
public class StarStamping21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] star = new String[2]; // 0 1

        if (n >= 1 && n <= 100) {
            for (int i = 0; i < 2; ++i) {
                star[i] = "";
            }

            for (int i = 0; i < n; ++i) {
                if (i % 2 != 0) {
                    star[1] += " *";
                } else
                    star[0] += "* ";
            }

            for (int i = 0; i < n; ++i) {
                System.out.println(star[0]);
                System.out.println(star[1]);
            }

        }

        sc.close();
    }
}
