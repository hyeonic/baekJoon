package baekJoon.stage16;

import java.io.*;

// 19-10 1676 팩토리얼 0의 개수
public class NumberOfZero {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter( System.out ) );

        int n = Integer.parseInt(bufferedReader.readLine());
        int count = 0;

        for (int i = 5; i <= n; i *= 5) {
            count += n / i;
        }

        bufferedWriter.write(count + "");

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();

    }

}



