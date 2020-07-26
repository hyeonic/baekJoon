package baekJoon.stage13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 13-5 1436 영화감독 숌
public class MovieDirectorSyom {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int input = Integer.parseInt( br.readLine() );
		int count = 0;

		for( int i = 0; i < Integer.MAX_VALUE; ++i ) {
//			String[] temp = Integer.toString(i).split("");
//
//			for( int j = 1; j < temp.length - 1; ++j ) {
//				if( temp[j - 1].equals("6") && temp[j].equals("6") && temp[j + 1].equals("6") ) {
//					++count;
//				}
//			}

			String temp = Integer.toString(i);

			if( temp.contains("666") ) {
				++count;
			}

			if( count == input ) {
				bw.write(i + "");
				break;
			}

		}

		bw.flush();
		br.close();
		bw.close();
	}
}
