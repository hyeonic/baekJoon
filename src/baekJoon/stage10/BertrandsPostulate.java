package baekJoon.stage10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 10-4 4948 베르트랑 공준
/*
	베르트랑 공준. 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작서나 같은 소수는 적어도 하나 존재한다.
	이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년 증명함.

	에라토스테네스의 체 (소수 구하는 알고리즘)을 사용하여 수행시간을 최소로 한다.
 */
public class BertrandsPostulate {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean isDone = true;

		while( isDone ) {
			int m = Integer.parseInt( br.readLine() );
			int n = 2 * m;
			int count = 0;

			if ( m == 0 ) {
				isDone = false;
				break;
			}

			boolean[] array = new boolean[n + 1];
			array[0] = false;
			array[1] = false;
			for ( int i = 2; i <= n; ++i ) {
				array[i] = true;
			}

			if ( m >= 1 && m <= 1000000 && n >= 1 && m <= 100000000 ) {

				for( int i = 2; i*i <= n; ++i ) {
					for( int j = i*i; j <= n;  j += i ) {
						array[j] =false;
					}
				}

				for(int i = m + 1; i <= n; ++i ) {
		            if(true == array[i]) {
		            	++count;
		            }
		        }
			}
			bw.write(count + "\n");
		}

		bw.flush();
		br.close();
		bw.close();
	}

}
