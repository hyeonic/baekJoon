package baekJoon.stage09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 9-3 2292 벌집
public class Honeycomb {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int target = Integer.parseInt( br.readLine() );
		int count = 1;
		int end = 1;
		boolean isDone = true;

		int i = 1;
		while ( isDone ) {
			//System.out.println( "end num: " + end );
			if ( end < target ) {
				end += 6*i;
				++i;
				++count;
			}else {
				isDone = false;
			}
		}

		bw.write( String.valueOf(count) );

		bw.flush();
		br.close();
		bw.close();
	}

}
