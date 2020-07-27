package baekJoon.stage14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

// 14-5 1427 소트인사이드
public class SortInside {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		ArrayList<Integer> intList = new ArrayList();

		String[] st = br.readLine().split("");
		for( int i = 0; i < st.length; ++i ) {
			intList.add( Integer.parseInt(st[i]) );
		}

		Collections.sort(intList);

		for(int i = intList.size() - 1; i >= 0; --i ) {
			bw.write( intList.get(i) + "" );
		}

		bw.flush();
		br.close();
		br.close();
	}
}
