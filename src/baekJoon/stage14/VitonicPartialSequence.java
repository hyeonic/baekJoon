package baekJoon.stage14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 16-12 11054 가장 긴 바이토닉 부분수열
public class VitonicPartialSequence {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[][] dp = new int[2][n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; ++i) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        // 정방향
        for (int i = 0; i < n; ++i) {
            dp[0][i] = 1;
            for (int j = 0; j < n; ++j) {
                if (a[j] < a[i] && dp[0][i] < dp[0][j] + 1) {
                    ++dp[0][i];
                }
            }
        }

        // 역방향
        for (int i = n - 1; i >= 0; --i) {
            dp[1][i] = 1;
            for (int j = n - 1; j >= 0; --j) {
                if (a[j] < a[i] && dp[1][i] < dp[1][j] + 1) {
                    ++dp[1][i];
                }
            }
        }

        int[] result = new int[n];
        int max = 0;
        for (int i = 0; i < n; ++i) {
            result[i] = dp[0][i] + dp[1][i];
            if (max < result[i]) {
                max = result[i];
            }
        }

        bw.write((max - 1) + "");

        bw.flush();
        br.close();
        bw.close();
    }

}
