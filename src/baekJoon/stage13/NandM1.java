package baekJoon.stage13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 15-1 15649 N과 M (1)
// 순열
// 순서를 생각하고 중복을 허락하지 않는 경우 이는 순열  nPr 이다.
public class NandM1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()); // n개 중에
        int m = Integer.parseInt(st.nextToken()); // m개를 뽑는 것

        int[] array = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; ++i) {
            array[i] = i + 1;
        }

        int[] output = new int[n];

        permutation(array, output, visited, 0, n, m);

        bw.flush();
        br.close();
        bw.close();
    }

    static void permutation(int[] array, int[] output, boolean[] visited, int depth, int n, int m) throws IOException {
        if (depth == m) {
            print(output, visited, m);
            return;
        }

        for (int i = 0; i < n; ++i) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = array[i];
                permutation(array, output, visited, depth + 1, n, m);
                visited[i] = false;
            }
        }
    }

    static void print(int[] output, boolean[] visited, int n) throws IOException {
        for (int i = 0; i < n; ++i) {
            bw.write(output[i] + " ");

        }
        bw.write("\n");
    }
}
