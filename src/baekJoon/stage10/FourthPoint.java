package baekJoon.stage10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

// 10-7 3009 네 번째 점 CETVRTA
public class FourthPoint {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		HashMap<Integer, Integer> xMap = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> yMap = new HashMap<Integer, Integer>();

		for (int t = 0; t < 3; ++t ) {
			StringTokenizer st = new StringTokenizer( br.readLine(), " " );
			int x = Integer.parseInt( st.nextToken() );
			int y = Integer.parseInt( st.nextToken() );

			if ( !xMap.containsKey(x) ) {
				xMap.put(x, 1);
			}else
				xMap.put(x, 2);

			if ( !yMap.containsKey(y) ) {
				yMap.put(y, 1);
			}else
				yMap.put(y, 2);

			//System.out.println("x: " + x + " x count : " + xMap.get(x));
			//System.out.println("y: " + y + " y count : " + yMap.get(y));
		}

		for (int x : xMap.keySet()) {
			if ( xMap.get(x) == 1 ) {
				bw.write(x + " ");
			}
		}

		for (int y : yMap.keySet()) {
			if ( yMap.get(y) == 1 ) {
				bw.write(y + "");
			}
		}

		bw.flush();
		br.close();
		bw.close();
	}
}
