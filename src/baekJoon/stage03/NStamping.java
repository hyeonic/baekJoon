package baekJoon.stage03;

import java.util.Scanner;

// 3-5 2741 N 찍기
public class NStamping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; ++i) {
            System.out.println(i);
        }
    }
}
