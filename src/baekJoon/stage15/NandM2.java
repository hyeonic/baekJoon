package baekJoon.stage15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 15-2 15650 N과 M (2)
// 조합
// 순서를 생각하지 않고 중복을 허락하지 않는 경우 이는 조합 nCr이다.
public class NandM2 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		StringTokenizer st = new StringTokenizer( br.readLine(), " " );
		int n = Integer.parseInt( st.nextToken() ); // n개 중에
		int m = Integer.parseInt( st.nextToken() ); // m개를 뽑는 것

		int[] array = new int[n];
		boolean[] visited = new boolean[n];

		for( int i = 0; i < n; ++i ) {
			array[i] = i + 1;
		}

		combination( array, visited, 0, n, m );

		bw.flush();
		br.close();
		bw.close();
	}

	static void combination( int[] array, boolean[] visited, int start, int n, int m ) throws IOException {
		if( m == 0 ) {
			print( array, visited, n );
			return;
		}

		for( int i = start; i < n; ++i ) {
			visited[i] = true;
			combination( array, visited, i + 1, n, m - 1 );
			visited[i] = false;
		}
	}

	static void print( int[] array, boolean[] visited, int n ) throws IOException {
		for( int i = 0; i < n; ++i ) {
			if( visited[i] ) {
				bw.write( array[i] + " " );
			}
		}
		bw.write("\n");
	}
}
