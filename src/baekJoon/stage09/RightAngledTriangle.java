package baekJoon.stage09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 10-8 4153 직각삼각형 Egypt
public class RightAngledTriangle {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> aList = new ArrayList();

        while (true) {
            int max = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            aList.add(a);
            aList.add(b);
            aList.add(c);

            aList.sort(null);

            if (aList.get(0) * aList.get(0) + aList.get(1) * aList.get(1) == aList.get(2) * aList.get(2)) {
                bw.write("right" + "\n");
            } else
                bw.write("wrong" + "\n");

            aList.clear();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
