package baekJoon.stage16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 16-2 1003 피보나치 함수
public class FibonacciFunction {

    static ZeroAndOne[] fibonacci;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        fibonacci = new ZeroAndOne[41];

        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        ZeroAndOne zo0 = new ZeroAndOne(1, 0);
        ZeroAndOne zo1 = new ZeroAndOne(0, 1);

        fibonacci[0] = zo0;
        fibonacci[1] = zo1;

        for (int i = 2; i <= 40; ++i) {
            ZeroAndOne temp = new ZeroAndOne(fibonacci[i - 1].zero + fibonacci[i - 2].zero, fibonacci[i - 1].one + fibonacci[i - 2].one);
            fibonacci[i] = temp;
        }

        for (int i = 0; i < n; ++i) {
            bw.write(fibonacci[arr[i]].zero + " " + fibonacci[arr[i]].one + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    static private class ZeroAndOne {
        private int zero;
        private int one;

        public ZeroAndOne(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }
    }
}
