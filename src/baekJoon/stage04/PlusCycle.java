package baekJoon.stage04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 4-3 1110 더하기 사이클
public class PlusCycle {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt( br.readLine() );
		int count = 0;
		int temp = n;

		while( true ) {

			++count;

			int temp1 = temp/10;
			int temp2 = temp%10;

			temp = (temp1 + temp2)%10 + temp2*10;
			System.out.println( "temp1 : " + temp1 + " temp2 : " + temp2 + " temp : " + temp );
			if( temp == n ) {
				break;
			}
		}

		bw.write( count + "" );

		bw.flush();
		br.close();
		bw.close();
	}
}
