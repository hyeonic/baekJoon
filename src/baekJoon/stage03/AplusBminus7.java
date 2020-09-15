package baekJoon.stage03;

import java.util.Scanner;

// 3-7 11021 A + B - 7
public class AplusBminus7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int a;
        int b;
        int[] result;

        n = sc.nextInt();
        result = new int[n];

        for (int i = 0; i < n; ++i) {
            a = sc.nextInt();
            b = sc.nextInt();

            if (a > 0 && b < 10)
                result[i] = a + b;
        }

        for (int i = 0; i < n; ++i) {
            System.out.println("Case #" + (i + 1) + ": " + result[i]);
        }

        sc.close();
    }
}
