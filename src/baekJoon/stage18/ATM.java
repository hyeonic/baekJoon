package baekJoon.stage18;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// 18-3 11399 ATM
public class ATM {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());
        int[] withdrawalTimes = new int[n];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < n; ++i) {
            withdrawalTimes[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(withdrawalTimes);

        int temp = 0;
        for (int i = 0; i < n; ++i) {
            temp += withdrawalTimes[i];
            withdrawalTimes[i] = temp;
        }

//        for( int withdrwalTime : withdrawalTimes ) {
//            System.out.println( withdrwalTime );
//        }

        int sum = 0;
        for (int withdrwalTime : withdrawalTimes) {
            sum += withdrwalTime;
        }

        bufferedWriter.write(sum + "");

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();

    }

}
