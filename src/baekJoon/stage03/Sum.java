package baekJoon.stage03;

import java.util.Scanner;

// 3-3 8393 합
public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        int result = 0;

        n = scanner.nextInt();

        for (int i = 0; i <= n; ++i) {
            result += i;
        }

        System.out.println(result);
    }
}
