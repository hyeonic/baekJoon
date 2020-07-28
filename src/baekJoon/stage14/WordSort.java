package baekJoon.stage14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

//14-8 1181 단어 정렬
public class WordSort {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt( br.readLine() );

		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
        	arr[i] = br.readLine().trim();
        }

        Arrays.sort(arr, ( x , y ) -> {

        	if( x.length() > y.length() ) { // x의 길이가 더 길면 return 1
        		return 1;
        	}else if( x.length() == y.length() ) { // x와 y의 길이가 같으면 compareTo를 활용해 사전 순 정리
        		return x.compareTo(y);
        	}
        	return -1; // 아니라면 return -1

        });

        for (int i = 0; i < n; i++) {

        	if( i < n - 1 && arr[i].equals( arr[i + 1] ) ) {
            		continue;
            }else {
            	  bw.write( arr[i] + "\n" );
            }
        }

		bw.flush();
		br.close();
		bw.close();
	}
}
