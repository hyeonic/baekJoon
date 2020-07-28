package baekJoon.stage14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// 14-6 11650 좌표 정렬하기
public class CoordinateSort {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt( br.readLine() );

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
        	String[] str = br.readLine().split(" ");
            arr[i][0] =Integer.parseInt( str[0] );
            arr[i][1] = Integer.parseInt( str[1] );
        }

        Arrays.sort(arr, ( x , y ) -> {

                if (x[0] == y[0])
                    return Integer.compare( x[1], y[1] );

                return Integer.compare( x[0], y[0] );

        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

		bw.flush();
		br.close();
		bw.close();
	}
}
