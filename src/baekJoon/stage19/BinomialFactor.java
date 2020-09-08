package baekJoon.stage19;

import java.io.*;
import java.util.StringTokenizer;

// 19-7 11050 이항 계수1
public class BinomialFactor {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter( System.out ) );

        StringTokenizer stringTokenizer = new StringTokenizer( bufferedReader.readLine(), " " );
        int n = Integer.parseInt( stringTokenizer.nextToken() );
        int k = Integer.parseInt( stringTokenizer.nextToken() );

        int result = factorial(n) / ( factorial(k) * factorial( n - k ) );

        bufferedWriter.write( result + "" );

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();

    }

    public static int factorial( int n ) {
       int[] factorial = new int[n + 1];
       factorial[0] = 1;

       for( int i = 1; i <= n; ++i ) {
           factorial[i] = factorial[i - 1] * i;
       }

       return factorial[n];
    }

}
