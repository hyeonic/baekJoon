package baekJoon.stage14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class SortNum {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int size = Integer.parseInt( br.readLine() );
		HashSet<Integer> intSet  = new HashSet();

		for( int i = 0; i < size; ++i ) {
			int num = Integer.parseInt( br.readLine() );
			intSet.add(num);
		}

		for( int value : intSet ) {
			bw.write( value + "\n");
		}

		bw.flush();
		br.close();
		bw.close();
	}

}
