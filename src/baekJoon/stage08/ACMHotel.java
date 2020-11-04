package baekJoon.stage08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 10250 ACM 호텔
public class ACMHotel {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; ++i) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());


            if (n % h == 0) {
                if (n / h < 10) {
                    bw.write(String.valueOf(h) + "0" + String.valueOf(n / h) + "\n");
                } else if (n / h >= 10) {
                    bw.write(String.valueOf(h) + String.valueOf(n / h) + "\n");
                }
            } else if (n % h != 0) {
                if ((n / h) + 1 < 10) {
                    bw.write(String.valueOf(n % h) + "0" + String.valueOf((n / h) + 1) + "\n");
                } else if ((n / h) + 1 >= 10) {
                    bw.write(String.valueOf(n % h) + String.valueOf((n / h) + 1) + "\n");
                }
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
