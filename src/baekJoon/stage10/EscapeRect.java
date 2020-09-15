package baekJoon.stage10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 10-6 1085 직사각형에서 탈출
public class EscapeRect {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        if (x - 0 < w - x) {
            minX = x - 0;
        } else
            minX = w - x;

        //System.out.println("minX : " + minX);

        if (y - 0 < h - y) {
            minY = y - 0;
        } else
            minY = h - y;

        //System.out.println("miny : " + minY);

        if (minX < minY) {
            bw.write(String.valueOf(minX));
        } else
            bw.write(String.valueOf(minY));

        bw.flush();
        br.close();
        bw.close();
    }
}
