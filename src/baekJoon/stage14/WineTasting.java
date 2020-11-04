package baekJoon.stage14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 16-10 2156 포도주 시식
public class WineTasting {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] wine = new int[n + 1];
        int[] dp = new int[n + 1];

        wine[0] = 0;
        for (int i = 1; i <= n; ++i) {
            wine[i] = Integer.parseInt(br.readLine());
        }

        if (n == 1) {
            dp[1] = wine[1];
        } else if (n == 2) {
            dp[1] = wine[1];
            dp[2] = dp[1] + wine[2];
        } else if (n >= 3) {
            dp[1] = wine[1];
            dp[2] = dp[1] + wine[2];
            dp[3] = max(dp[2], dp[1] + wine[3], wine[2] + wine[3]);

            for (int i = 4; i <= n; ++i) {
                dp[i] = max(dp[i - 1], dp[i - 2] + wine[i], dp[i - 3] + wine[i - 1] + wine[i]);
                // oox oxo xoo 인 경우
            }
        }

//		for( int value : dp ) {
//			System.out.println( "value : " + value );
//		}

        bw.write(dp[n] + "");

        bw.flush();
        br.close();
        bw.close();
    }

    static int max(int a, int b, int c) {

        if (a >= b) {
            if (a >= c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b >= c) {
                return b;
            } else {
                return c;
            }
        }

    }
}
