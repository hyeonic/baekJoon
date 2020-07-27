package baekJoon.stage14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 14-3 10989 수 정렬하기 3
/*
 * counting sort를 활용하여 풀이
 */
public class SortNum3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int size = Integer.parseInt( br.readLine() );
		int[] intArray = new int[size];

		for( int i = 0; i < size; ++i ) {
			intArray[i] = Integer.parseInt( br.readLine() );
		}

		intArray = sort(intArray);

		for( int i = 0; i < intArray.length; ++i ) {
			bw.write( intArray[i] + "\n" );
		}

		bw.flush();
		br.close();
		bw.close();
	}

	public static int[] sort( int[] intArray ) {

		int max = max( intArray );
		int[] aux = new int[ intArray.length ];
		int[] c = new int[ max + 1 ];

		for( int i = 0; i < c.length; ++i ) {
			c[i] = 0;
		}

		// 각 원소 갯수 계산
        for ( int i = 0; i<intArray.length; ++i ) {
            c[intArray[i]] += 1;
        }
        // 누적합 계산
        for ( int i = 1; i < c.length; ++i ) {
            c[i] += c[i-1];
        }
        // 누적합을 이용해 정렬
        for ( int i = intArray.length-1; i >= 0; --i ) {
            aux[--c[intArray[i]]] = intArray[i];
        }

		return aux;
	}

	public static int max( int[] intArray ) {

		int max = 0;

		for( int i = 0; i < intArray.length; ++i ) {
			if( max < intArray[i] ) {
				max = intArray[i];
			}
		}

		return max;
	}
}
