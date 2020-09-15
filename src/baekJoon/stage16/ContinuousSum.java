package baekJoon.stage16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


// 16-15 1912 연속합
public class ContinuousSum {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> arr = new ArrayList();
        ArrayList<Integer> dp = new ArrayList();

        while (st.hasMoreTokens()) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        dp.add(0, arr.get(0));

        if (arr.size() > 1) {
            for (int i = 1; i < arr.size(); ++i) {
                if (arr.get(i) <= arr.get(i) + dp.get(i - 1)) {
                    dp.add(i, arr.get(i) + dp.get(i - 1));
                } else {
                    dp.add(i, arr.get(i));
                }
            }
        }

        int result = Collections.max(dp);

//		for( int value : dp ) {
//			System.out.println( "value: " + value );
//		}

        bw.write(result + "");

        bw.flush();
        br.close();
        bw.close();
    }

}
