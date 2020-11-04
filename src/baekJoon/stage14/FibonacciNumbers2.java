package baekJoon.stage14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 16-1 2748 피보나치 수 2
public class FibonacciNumbers2 {

    static long[] fibonacci; // 수가 기하급수적으로 늘어나기 때문에 long type으로 선언 후 사용해야 한다.
    static int n;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        fibonacci = new long[n + 1];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i <= n; ++i) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

//		for( int value : fibonacci ) {
//			System.out.print( value + " " );
//		}

        bw.write(fibonacci[n] + "");

        bw.flush();
        br.close();
        bw.close();
    }
}
