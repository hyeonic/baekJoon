package baekJoon.stage16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 16-5 1149 RGB거리
public class RGBDistance {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] rgbArr = new int[n][3];
        int[][] dpArr = new int[n][3];

        for (int i = 0; i < n; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            rgbArr[i][0] = Integer.parseInt(st.nextToken()); // R
            rgbArr[i][1] = Integer.parseInt(st.nextToken()); // G
            rgbArr[i][2] = Integer.parseInt(st.nextToken()); // B
        }

        dpArr[0][0] = rgbArr[0][0];
        dpArr[0][1] = rgbArr[0][1];
        dpArr[0][2] = rgbArr[0][2];

        for (int i = 1; i < n; ++i) {
            dpArr[i][0] = Math.min(dpArr[i - 1][1], dpArr[i - 1][2]) + rgbArr[i][0];
            dpArr[i][1] = Math.min(dpArr[i - 1][0], dpArr[i - 1][2]) + rgbArr[i][1];
            dpArr[i][2] = Math.min(dpArr[i - 1][0], dpArr[i - 1][1]) + rgbArr[i][2];
        }

        bw.write(Math.min(Math.min(dpArr[n - 1][0], dpArr[n - 1][1]), dpArr[n - 1][2]) + "");

        bw.flush();
        br.close();
        bw.close();
    }
}
