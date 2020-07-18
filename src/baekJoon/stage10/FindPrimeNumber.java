package baekJoon.stage10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 10-3 1929 소수 구하기
/*
 	M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
 	에라토스테네스의 체 (소수 구하는 알고리즘)을 사용하여 수행시간을 최소로 한다.
 	소수 => 1과 자기 자신으로밖에 나누어지지 않는 1 이외의 정수.
 	에라토스네스의 체 => 제일 작은 소수 2부터 시작하여 체에서 배수를 모두 거두는 방식

 	더욱 시간을 줄이는 방법
 	해당 숫자의 절반까지만 확인 => 시간 복잡도 O(N)
 	해당 숫자의 √N 까지 확인하는 방법, 약수의 중심을 구하는 방법 => 시간 복잡도 O(√N) <-- 이 방법을 사용하여 풀이함
 */
public class FindPrimeNumber {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int m = Integer.parseInt( st.nextToken() );
		int n = Integer.parseInt( st.nextToken() );

		boolean[] array = new boolean[n + 1];
		array[0] = false;
		array[1] = false;
		for ( int i = 2; i <= n; ++i ) {
			array[i] = true;
		}

		if ( m >= 1 && m <= 1000000 && n >= 1 && m <= 100000000 ) {

			for( int i = 2; i*i <= n; ++i ) { // 2부터 n까지의 수 중에서 소수는 n의 제곱근보다 작은 소수의 배수를 모두 지우고 남은 수는 모두 소수이다.
				for( int j = i*i; j <= n;  j += i ) { // 해당 배수는 prime이 아니므로 false
					array[j] =false;
				}
			}

			for(int i = m; i <= n; ++i ) {
	            if(true == array[i]) {
	                bw.write(i + "\n");
	            }
	        }
		}

		bw.flush();
		br.close();
		bw.close();
	}
}
