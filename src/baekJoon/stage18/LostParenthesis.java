package baekJoon.stage18;

import java.io.*;

// 18-4 1541 잃어버린 괄호
public class LostParenthesis {

    public static void main( String[] args ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter( System.out ) );

        String n = bufferedReader.readLine();
        int result = 0;

        String[] minusSplit = n.split( "-" );

        for( int i = 0; i < minusSplit.length; ++i ) {
            int sum = 0;
            String[] plusOperand = minusSplit[i].split( "\\+" );

//            System.out.println( "length : " + plusOperand.length );

            int operand1 = Integer.parseInt( plusOperand[0] );
            int operand2 = Integer.parseInt( plusOperand[1] );
            sum += operand1 + operand2;


//            System.out.println( "sum : " + sum );

            if( i == 0 ) {
                result += sum;
            }else {
                result -= sum;
            }
        }

        bufferedWriter.write( result + "" );

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();

    }

}
