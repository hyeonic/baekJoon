package baekJoon.stage19;

import java.io.*;

// 19-3 11653 소인수분해
public class Factorization {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter( System.out ) );

        int n = Integer.parseInt( bufferedReader.readLine() );
        int i = 2;

        while ( n >= i ) {
            if( n % i == 0 ) {
                bufferedWriter.write( i + "\n" );
                n /= i;
            }else {
                ++i;
            }
        }

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();

    }

}
