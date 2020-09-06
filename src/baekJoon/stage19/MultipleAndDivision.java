package baekJoon.stage19;

import java.io.*;
import java.util.StringTokenizer;

// 19-1 5086 배수와 약수
public class MultipleAndDivision {

    public static void main(String[] args) throws IOException  {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter( System.out ) );

        int x;
        int y;
        String result = "";

        while( true ) {
            StringTokenizer stringTokenizer = new StringTokenizer( bufferedReader.readLine(), " " );
            x = Integer.parseInt( stringTokenizer.nextToken() );
            y = Integer.parseInt( stringTokenizer.nextToken() );

            if( x == 0 && y == 0 ) {
                break;
            }

            if( x >= y ) {
                if( x % y == 0 ) {
                    result = "multiple";
                    bufferedWriter.write( "multiple\n" );
                }else {
                    bufferedWriter.write( "neither\n" );
                }
            }else {
                if( y % x == 0 ) {
                    result = "multiple";
                    bufferedWriter.write( "factor\n" );
                }else {
                    bufferedWriter.write( "neither\n" );
                }
            }
        }

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();

    }
}
