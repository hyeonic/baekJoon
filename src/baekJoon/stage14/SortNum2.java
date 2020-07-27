package baekJoon.stage14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

// 14-2 2751 수 정렬하기 2
/*
 *
 */
public class SortNum2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int size = Integer.parseInt( br.readLine() );
		ArrayList<Integer> intList = new ArrayList();

		for( int i = 0; i < size; ++i ) {
			intList.add( Integer.parseInt( br.readLine() ) );
		}

		Collections.sort(intList);

		for( int i = 0; i < intList.size(); ++i ) {
			bw.write( intList.get(i) + "\n" );
		}

		bw.flush();
		br.close();
		bw.close();
	}
}
