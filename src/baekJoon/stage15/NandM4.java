package baekJoon.stage15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 15-4 15652 N과 M (4)
// 중복 조합
// 순서를 생각하지 않고 중복을 허락하는 경우 이는 중복조합 nHr이다.
public class NandM4 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()); // n개 중에
        int m = Integer.parseInt(st.nextToken()); // m개를 뽑는 것

        int[] array = new int[n];

        for (int i = 0; i < n; ++i) {
            array[i] = i + 1;
        }

        int[] output = new int[m];

        combination(array, output, 0, n, m);

        bw.flush();
        br.close();
        bw.close();
    }

    static void combination(int[] array, int[] output, int start, int n, int m) throws IOException {

        if (start == m) {
            print(output, output.length);
            return;
        }

        for (int i = 0; i < n; ++i) {
            output[start] = array[i];
            if (start == 0) {
                combination(array, output, start + 1, n, m);
            } else if (start > 0 && output[start] >= output[start - 1]) { // 전보다 무조건 크거나 같아야 함
                combination(array, output, start + 1, n, m);
            }
        }

    }

    static void print(int[] output, int length) throws IOException {
        for (int i = 0; i < length; ++i) {
            bw.write(output[i] + " ");
        }
        bw.write("\n");
    }
}
