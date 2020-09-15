package baekJoon.stage16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 16-11 11053 가장 긴 증가하는 부분 수열
public class PartialSequence {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] dp = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; ++i) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int count = 1;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (a[i] > a[j]) {
                    if (count < dp[j] + 1) {
                        count = dp[j] + 1;
                    }
                }
            }
            dp[i] = count;
            count = 1;
        }

        int max = 0;
        for (int value : dp) {
            System.out.println(" value : " + value);
            if (max < value) {
                max = value;
            }
        }

        bw.write(max + "");

        bw.flush();
        br.close();
        bw.close();
    }
}
