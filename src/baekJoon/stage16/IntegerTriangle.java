package baekJoon.stage16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class IntegerTriangle {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt( br.readLine() );
		ArrayList<ArrayList<Integer>> triangleList = new ArrayList();
		ArrayList<ArrayList<Integer>> dpList = new ArrayList();

		for( int i = 0; i < n; ++i ) {
			ArrayList<Integer> tempList = new ArrayList();
			StringTokenizer st = new StringTokenizer( br.readLine(), " " );

			while( st.hasMoreTokens() ) {
				tempList.add( Integer.parseInt( st.nextToken() ) );
			}

			triangleList.add( tempList );
		}

		dpList.add( 0, triangleList.get(0) );

		for( int i = 1; i < n; ++i ) {
			dpList.add(i, new ArrayList() );
			for( int j = 0; j < triangleList.get(i).size(); ++j ) {

//				System.out.println( "i : " + i + " j : " + j );

				if( j == 0 ) {
					dpList.get(i).add( j, dpList.get(i - 1).get(j) + triangleList.get(i).get(j) );
//					System.out.println( "1 => i - 1 + i : " + ( triangleList.get(i - 1).get(j) + triangleList.get(i).get(j) ) );
				}else if( j == triangleList.get(i).size() - 1 ) {
					dpList.get(i).add( j, dpList.get(i - 1).get(j - 1) + triangleList.get(i).get(j) );
//					System.out.println( "2 => i - 1 + i : " + ( triangleList.get(i - 1).get(j - 1) + triangleList.get(i).get(j) ) );
				}else {
					dpList.get(i).add( j, Math.max( dpList.get(i - 1).get(j - 1), dpList.get(i - 1).get(j) ) + triangleList.get(i).get(j) );
//					System.out.println( "3 => i - 1 + i : " + ( Math.max( triangleList.get(i - 1).get(j - 1), triangleList.get(i - 1).get(j) ) + triangleList.get(i).get(j) ) );
				}
			}
		}

		Collections.sort( dpList.get(n - 1) );

//		for( int value : dpList.get(n - 1) ) {
//			System.out.println( "value : " + value );
//		}

		bw.write( dpList.get(n - 1).get( dpList.get(n - 1).size() - 1 ) + "" );

		bw.flush();
		br.close();
		bw.close();
	}
}
