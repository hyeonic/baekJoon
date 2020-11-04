package baekJoon.stage15;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 18-1 11047 동전 0
public class ZeroCoin {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());
        ArrayList<Integer> coins = new ArrayList();
        int count = 0;

        for (int i = 0; i < n; ++i) {
            int coin = Integer.parseInt(br.readLine());
            coins.add(coin);
        }

        for (int i = n - 1; i >= 0; --i) {
//            System.out.println( "k : " + k + " coin : " + coins.get( i ) );

            if (k >= coins.get(i)) {
                count += k / coins.get(i);
                k %= coins.get(i);
            }

        }

        System.out.println("count : " + count);

        bw.write(count + "");

        bw.flush();
        br.close();
        bw.close();
    }

}
