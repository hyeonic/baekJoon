package baekJoon.stage19;

import java.io.*;
import java.util.*;

// 19-9 9375 패션왕 신혜빈
public class FashionKingSHB {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter( System.out ) );

        int testCase = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < testCase; ++i) {
            int n = Integer.parseInt(bufferedReader.readLine());
            HashMap<String, Integer> wearMap = new HashMap<>();

            for (int j = 0; j < n; ++j) {
                StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
                stringTokenizer.nextToken();
                String wear = stringTokenizer.nextToken();

                if (wearMap.containsKey(wear)) {
                    wearMap.put(wear, wearMap.get(wear) + 1);
                }else {
                    wearMap.put(wear, 1);
                }
            }

            int result = 1;

            for (int value : wearMap.values()) {
                result *= value + 1;
            }
            bufferedWriter.write((result - 1) + "\n");

        }

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();

    }
}




