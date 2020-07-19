package baekJoon.stage10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 10-10 1002 터렛
/*
	두 원 사이의 위치 관계로 해결하는 문제로 유추됨.
	두 원의 중심 좌표 사이의 거리와 두 원의 반지름의 합과의 비교를 통하여 두원이 외접하는지, 내접하는지 만나지 않는 지에 대해 판단함.
	내접한다면 1, 외접한다면 1, 겹친다면 2, 멀리 떨어져 있다면 0

	반례를 도저히 찾을 수가 없다...
 */
public class Turret {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int size = Integer.parseInt( br.readLine() );

		for(int t = 0; t < size; ++t ) {
			StringTokenizer st = new StringTokenizer( br.readLine(), " " );
			int x1 = Integer.parseInt( st.nextToken() );
			int y1 = Integer.parseInt( st.nextToken() );
			int r1 = Integer.parseInt( st.nextToken() );
			int x2 = Integer.parseInt( st.nextToken() );
			int y2 = Integer.parseInt( st.nextToken() );
			int r2 = Integer.parseInt( st.nextToken() );

//			int d = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );

//			if( d == Math.pow(r1 + r2, 2) ) { // 외접
//				bw.write( 1 + "\n" );
//			}else if( d == Math.pow(r2 - r1, 2) ) { // 내접
//				bw.write( 1 + "\n" );
//			}else if( d < Math.pow(r2 - r1, 2) ) { // 원 안에서 교차점이 없을 때
//				bw.write( 0 + "\n" );
//			}else if( d > Math.pow(r1 + r2, 2) ) { // 원 밖에서 교차점이 없을 때
//				bw.write( 0 + "\n" );
//			}else if( x1 == x2 && y1 == y2 && r1 == r2 ){
//				bw.write( -1 + "\n" );
//			}else {
//				bw.write( 2 + "\n" );
//			}

			bw.write( tangentPoint(x1, y1, r1, x2, y2, r2) + "\n" );
		}

		bw.flush();
		br.close();
		bw.close();
	}

	public static int tangentPoint(int x1, int y1, int r1, int x2, int y2, int r2) {

		int d = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		if(x1 == x2 && y1 == y2 && r1 == r2)
			return -1;
		else if(d > Math.pow(r1 + r2, 2))
			return 0;
		else if(d < Math.pow(r2 - r1, 2))
			return 0;
		else if(d == Math.pow(r2 - r1, 2))
			return 1;
		else if(d == Math.pow(r1 + r2, 2))
			return 1;
		else
			return 2;
	}
}



