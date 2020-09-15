package baekJoon.stage19;

import java.io.*;
import java.util.StringTokenizer;

//19-8 11051 이항계수2
public class BinomialFactor2 {

    public static int n, k;
    public static int[][] dp = new int[1001][1001];

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        n = Integer.parseInt(stringTokenizer.nextToken());
        k = Integer.parseInt(stringTokenizer.nextToken());

        bufferedWriter.write(pascals(n, k) + "");

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();

    }

    public static int pascals(int n, int k) {

        if (n == k || k == 0) {
            return 1;
        }

        if (dp[n][k] > 0) {
            return dp[n][k];
        }

        dp[n][k] = pascals(n - 1, k - 1) + pascals(n - 1, k);

        return dp[n][k] % 10007;
    }

}




