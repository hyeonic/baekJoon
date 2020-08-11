package baekJoon.stage16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

// 16-7 계단 오르기 2579
public class StairClimb {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt( br.readLine() );
		int[] stair = new int[n];
		ArrayList<Integer> dpList = new ArrayList();
		int currentIndex = 1;
		int oneStepCount = 0;

		for( int i = 0; i < n; ++i ) {
			stair[i] = Integer.parseInt( br.readLine() );
		}

		if( n == 1 ) {
			dpList.add( 0, stair[0] );
		}else if( n == 2 ) {
			dpList.add( 0, stair[0] );
			dpList.add( 1, stair[0] + stair[1] );
		}else if( n >= 3 ) {
			dpList.add( 0, stair[0] );
			dpList.add( 1, Math.max( stair[0] + stair[1] , stair[1] ) );
			dpList.add( 2, Math.max( stair[0] + stair[2] , stair[1] + stair[2] ) ); // 1칸 + 2칸 vs 2칸 + 1칸

			for( int i = 3; i < n; ++i ) {
				dpList.add( i, Math.max( dpList.get(i - 2) + stair[i], stair[i - 1] + stair[i] + dpList.get(i - 3) ) );
				// 전전 칸까지의 최대값  + 현재칸 vs 전전전 칸까지의 최대값 + 전칸 + 현재칸
			}
		}

		bw.write( dpList.get( dpList.size() - 1 ) + "" );

//		for( int value : dpList ) {
//			System.out.println( "value : " + value );
//		}

		bw.flush();
		br.close();
		bw.close();
	}
}
