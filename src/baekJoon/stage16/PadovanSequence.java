package baekJoon.stage16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 16-4 9461 파도반 수열
public class PadovanSequence {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] result = new int[n];
        long[] arr = new long[101];

        for (int i = 0; i < n; ++i) {
            result[i] = Integer.parseInt(br.readLine().trim());
        }

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 2;

        for (int i = 5; i <= 100; ++i) {
            arr[i] = arr[i - 1] + arr[i - 5];
        }

        for (int i = 0; i < n; ++i) {
            bw.write(arr[result[i]] + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
