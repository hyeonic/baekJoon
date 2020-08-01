package baekJoon.stage15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 15-3 15651 N과 M (3)
// 중복 순열
// 순서를 생각하고 중복을 허락하는 경우 이는 중복순열 nΠr이다.
public class NandM3 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		StringTokenizer st = new StringTokenizer( br.readLine(), " " );
		int n = Integer.parseInt( st.nextToken() ); // n개 중에
		int m = Integer.parseInt( st.nextToken() ); // m개를 뽑는 것

		int[] array = new int[n];

		for( int i = 0; i < n; ++i ) {
			array[i] = i + 1;
		}

		int[] output = new int[n];

		permutation( array, output, 0, n, m );

		bw.flush();
		br.close();
		bw.close();
	}

	static void permutation( int[] array, int[] output, int depth, int n, int m ) throws IOException {
		if( depth == m ) {
			print( output, m );
			return;
		}

		for( int i = 0; i < n; ++i ) {
			output[depth] = array[i];
			permutation( array, output, depth + 1, n, m );
		}
	}

	static void print( int[] output, int n ) throws IOException {
		for( int i = 0; i < n; ++i ) {
			bw.write( output[i] + " " );

		}
		bw.write("\n");
	}
}
