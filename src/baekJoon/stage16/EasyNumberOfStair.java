package baekJoon.stage16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 16-9 10844 쉬운 계단 수
public class EasyNumberOfStair {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[][] dp = new long[n + 1][10];
        long mod = 1000000000;

        for (int i = 1; i <= 9; ++i) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; ++i) {
            for (int j = 0; j < 10; ++j) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j + 1] % mod; // 끝 자리가 0일 경우 1일 때만 고려
                } else if (j == 9) {
                    dp[i][j] = dp[i - 1][j - 1] % mod; // 끝 자리가 9일 경우 8일 때만 고려
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod; // 나머지는 -1 일 때, +1모두 고려
                }
            }
        }
        long sum = 0;

        for (int i = 0; i < 10; ++i) {
            sum += dp[n][i];
        }

        bw.write((sum % mod) + "");

        bw.flush();
        br.close();
        bw.close();
    }

}
