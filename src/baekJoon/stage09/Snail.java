package baekJoon.stage09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 9-5 2869 달팽이는 올라가고 싶다.  ★
//
public class Snail {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int gap = a - b; // 격차
        int n = (int) Math.ceil((double) (v - a) / gap); // 하루를 제외한 올라갈 수 있는 day

        int dayM = n * a - (n - 1) * b; // nA - (n-1)B

        if (dayM >= v && dayM < (v + (a - b))) {
            // 전체 막대의 길이와 전체 막대의 길이에 올라가는 길이와 내려가는 길이의 차이를 더한 값의 사이에 있다면
            System.out.println(n);
        } else
            System.out.println(++n);

        //bw.write( String.valueOf(day) );

        bw.flush();
        br.close();
        bw.close();
    }
}
