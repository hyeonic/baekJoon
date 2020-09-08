package baekJoon.stage19;

import java.io.*;
import java.util.StringTokenizer;

// 19-6 3036 링
public class Ring {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter( System.out ) );

        int n = Integer.parseInt( bufferedReader.readLine() );
        int[] radius = new int[n];
        StringTokenizer stringTokenizer = new StringTokenizer( bufferedReader.readLine(), " " );

        for( int i = 0; i < n; ++i ) {
            radius[i] = Integer.parseInt(stringTokenizer.nextToken() );
        }

        int a = radius[0];
        for( int i = 1; i < n; ++i ) {
            int gcd = gcd( a, radius[i] );
            bufferedWriter.write( (a/gcd) + "/" + (radius[i]/gcd) + "\n" );
        }

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();

    }

    public static int gcd( int max, int min ) {
        int a = max;
        int b = min;
        while( b > 0 ) {
            int temp = a;
            a = b;
            b = temp%b;
        }
        return a;
    }

}
