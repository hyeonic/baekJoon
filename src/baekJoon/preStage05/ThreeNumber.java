package baekJoon.preStage05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// 5-3 10817 세 수
public class ThreeNumber {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        ArrayList<Integer> nums = new ArrayList();

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            nums.add(num);
        }

        Collections.sort(nums);

        bw.write(nums.get(1) + "");

        bw.flush();
        br.close();
        bw.close();
    }
}
