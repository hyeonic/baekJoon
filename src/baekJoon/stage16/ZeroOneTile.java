package baekJoon.stage16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 16-3 1904 01타일
public class ZeroOneTile {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Long[] arr = new Long[1100000]; // 대체 왜..?

        arr[1] = 1L;
        arr[2] = 2L;

        for (int i = 3; i < 1100000; ++i) {
            arr[i] = (arr[i - 2] + arr[i - 1]) % 15746;
        }

        bw.write((arr[n] % 15746) + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
