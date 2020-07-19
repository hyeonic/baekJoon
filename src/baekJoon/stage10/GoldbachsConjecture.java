package baekJoon.stage10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 10-5 9020 골드바흐의 추측
/*
	골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다.
	이러한 수를 골드바흐 수라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다.
	예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다.
	10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.
 */
public class GoldbachsConjecture {

	public static int MAX = 10000;
    public static boolean[] PRIMEARRAY;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		PRIMEARRAY = new boolean[MAX + 1];
		getPrimeNum();

		int count = Integer.parseInt( br.readLine() );

		for( int t = 0; t < count; ++t ) {
			int input = Integer.parseInt( br.readLine() );

			for (int i = input/2; i > 0; --i ) {
				int num1 = i;
				int num2 = input - i;
				if ( PRIMEARRAY[num1] && PRIMEARRAY[num2] ) {
					bw.write(String.valueOf(num1) + " " + String.valueOf(num2) + "\n");
					break;
				}
			}
		}

		bw.flush();
		br.close();
		bw.close();
	}

	public static void getPrimeNum() {
		PRIMEARRAY[0] = false;
		PRIMEARRAY[1] = false;

		for ( int i = 2; i <= MAX; ++i ) {
			PRIMEARRAY[i] = true;
		}

        for(int i = 2; i <= MAX; ++i ) {
            for(int j = 2; i*j <= MAX; ++j ) {
            	PRIMEARRAY[i*j] = false;
            }
        }
    }
}
