package baekJoon.stage14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 16-8 1436 1로 만들기
public class Make1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] make = new int[n + 4];
        int count = 0;

        make[0] = 0;
        make[1] = 0;
        make[2] = 1;
        make[3] = 1;

        for (int i = 3; i <= n; ++i) {

            if (i % 2 == 0 && i % 3 == 0) {
                int temp1 = Math.min(make[i / 3] + 1, make[i / 2] + 1);
                int temp2 = make[i - 1] + 1;

                make[i] = Math.min(temp1, temp2);
                continue;
            }

            if (i % 2 == 0) {
                make[i] = Math.min(make[i / 2] + 1, make[(i - 1)] + 1);
                continue;
            }

            if (i % 3 == 0) {
                make[i] = Math.min(make[i / 3] + 1, make[(i - 1)] + 1);
                continue;
            }

            make[i] = make[(i - 1)] + 1;
        }

        bw.write(make[n] + "");

        bw.flush();
        br.close();
        bw.close();
    }
}
