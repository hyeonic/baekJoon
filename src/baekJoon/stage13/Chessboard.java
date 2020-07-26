package baekJoon.stage13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 13-4 1018 체스판 다시 칠하기
public class Chessboard {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		String[] wStart = { "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW",
							"WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW"
		};

		String[] bStart = { "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB",
							"BWBWBWBW", "WBWBWBWB",	"BWBWBWBW", "WBWBWBWB"
	 	};

		StringTokenizer st = new StringTokenizer( br.readLine(), " ");
		int n = Integer.parseInt( st.nextToken() );
		int m = Integer.parseInt( st.nextToken() );

		String[] input = new String[n];

		for( int i = 0; i < n; ++i ) {
			input[i] = br.readLine();
		}

		int wStartCount = 0;
		int bStartCount = 0;
		int minCount = Integer.MAX_VALUE;

		// 비교하기
		for( int i = 0; i <= n - 8; ++i ) { // 0 ~ 2
			for( int j = 0; j <= m - 8; ++j ) { // 0 ~ 5
				//System.out.println("i : " + i + " j : " + j);
				int temp = 0;
				wStartCount = 0;
				bStartCount = 0;

				for( int k = 0; k <= 7; ++k ) {
					for( int t = 0; t <= 7; ++t ) {
						//System.out.println("k : " + k + " t : " + t);
						if( input[i + k].charAt(j + t) != wStart[k].charAt(t) ) {
							++wStartCount;
						}
						if( input[i + k].charAt(j + t) != bStart[k].charAt(t) ) {
							++bStartCount;
						}
					}
				}

				temp = (wStartCount > bStartCount) ? bStartCount : wStartCount;

				//System.out.println("temp: " + temp);
				if ( temp < minCount ) {
					minCount = temp;
				}
			}
		}

		bw.write(minCount + "");

		bw.flush();
		br.close();
		bw.close();
	}
}
