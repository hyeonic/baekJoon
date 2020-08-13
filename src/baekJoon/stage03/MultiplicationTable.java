package baekJoon.stage03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 3-1 2739 구구단
public class MultiplicationTable {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out) );

		int n = Integer.parseInt( br.readLine() );

		for( int i = 1; i <= 9; ++i ) {
			bw.write( n + " * " + i + " = " + ( n * i ) + "\n" );
		}

		bw.flush();
		br.close();
		bw.close();
	}

}
