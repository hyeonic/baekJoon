package baekJoon.stage14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 16-14 9251 LCS Longest Common Subsequence
public class LCS {

    private static int[][] c;
    static String[] x;
    static String[] y;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        x = br.readLine().split("");
        y = br.readLine().split("");

        int m = x.length;
        int n = y.length;

        c = new int[m + 1][n + 1];

        int result = lcs(m, n);

        bw.write(result + "");

        bw.flush();
        br.close();
        bw.close();
    }

    private static int lcs(int m, int n) {

        for (int i = 0; i <= m; ++i) {
            c[i][0] = 0;
        }

        for (int i = 0; i <= n; ++i) {
            c[0][i] = 0;
        }

        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (x[i - 1].equals(y[j - 1])) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                } else {
                    c[i][j] = max(c[i - 1][j], c[i][j - 1]);
                }
            }
        }

        return c[m][n];
    }

    private static int max(int x, int y) {

        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

}
