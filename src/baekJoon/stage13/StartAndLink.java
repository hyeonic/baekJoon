package baekJoon.stage13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 15-8 14889 스타트와 링크
public class StartAndLink {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int n;
    static int[][] intArray;
    static int min = Integer.MAX_VALUE;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());
        visited = new boolean[n + 1];
        intArray = new int[n + 1][n + 1];

        for (int i = 1; i <= n; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= n; ++j) {
                intArray[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        combination(1, 0);
        bw.write(min + "");

        bw.flush();
        br.close();
        bw.close();
    }

    static void combination(int start, int depth) {
        if (depth == n / 2) {
            min = Math.min(min, getDif());
            return;
        }

        for (int i = start; i <= n; ++i) {
            if (visited[i] != true) {
                visited[i] = true;
                combination(i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }

    static int getDif() {
        int sumStart = 0;
        int sumLink = 0;

        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {

                if (visited[i] && visited[j]) {
                    sumStart += intArray[i][j];
                }

                if (visited[i] == false && visited[j] == false) {
                    sumLink += intArray[i][j];
                }
            }
        }

        return Math.abs(sumStart - sumLink);
    }
}
