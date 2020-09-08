package baekJoon.stage19;

import java.io.*;
import java.util.StringTokenizer;

// 19-4 2609 최대굥약수와 최소공배수
public class MCDAndMCM {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer( bufferedReader.readLine(), " " );

        int x = Integer.parseInt( stringTokenizer.nextToken() );
        int y = Integer.parseInt( stringTokenizer.nextToken() );
        int max = 0;
        int min = 0;

        if( x >= y ) {
            max = x;
            min = y;
        }else {
            max = y;
            min = x;
        }

        int gcd = gcd(max, min);
        int lcm = lcm(max, min);

        bufferedWriter.write( gcd + "\n" );
        bufferedWriter.write( lcm + "" );

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

    public static int lcm( int max, int min ) {
        return (max * min)/gcd(max, min);
    }
}
