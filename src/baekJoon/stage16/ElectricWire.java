package baekJoon.stage16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 16-12 2565 전깃줄
public class ElectricWire {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[501];
        int[] dp = new int[501];

        for (int i = 1; i <= n; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a] = b;
        }

        int aMax = 0;
        int bMax = 0;
        for (int i = 1; i <= 500; ++i) {
            dp[i] = 1;
            for (int j = 1; j <= i; ++j) {
                if (arr[j] != 0 && arr[i] != 0) {
//					System.out.println( "i : " + i + " || j : " + j );
//					System.out.print( "(" + i + ", " + arr[i] + ")" + " vs " );
//					System.out.print( "(" + j + ", " + arr[j] + ")" );
//					System.out.println();
                    if (j < i && arr[j] < arr[i] && dp[i] < dp[j] + 1) {
                        ++dp[i];
                    }
                }
            }
            if (arr[i] != 0) {
//				System.out.println( dp[i] + "\n" );
            }
        }

        int max = 0;
        for (int value : dp) {
//			System.out.println( "value: " + value );
            if (max < value) {
                max = value;
            }
        }

        bw.write((n - max) + "");

        bw.flush();
        br.close();
        bw.close();
    }

}
