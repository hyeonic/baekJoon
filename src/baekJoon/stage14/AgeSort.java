package baekJoon.stage14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// 14-9 10814 나이순 정렬
public class AgeSort {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt( br.readLine() );

		String[][] persons = new String[n][2];

		for (int i = 0; i < n; i++) {
        	StringTokenizer st = new StringTokenizer( br.readLine(), " " );
        	persons[i][0] = st.nextToken();
        	persons[i][1] = st.nextToken();
        }

        Arrays.sort( persons, ( x , y ) -> {
        	return Integer.compare( Integer.parseInt(x[0]), Integer.parseInt(y[0]) );
        });

        for( int i = 0; i < n; ++i ) {
        	bw.write( persons[i][0] + " " + persons[i][1] +"\n" );
        }

		bw.flush();
		br.close();
		bw.close();
	}
}
