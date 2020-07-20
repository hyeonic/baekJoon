package baekJoon.stage11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 11-4 11729 하노이 탑 이동 순서
public class Hanoi {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringBuilder sb = new StringBuilder();
	static int count = 0;


	public static void main(String[] args) throws IOException {

		int n = Integer.parseInt( br.readLine() );

		hanoi(n, 1, 2, 3);

		System.out.println(count);
		System.out.println(sb);

		br.close();
	}

	public static void hanoi(int n, int from, int by, int to) throws IOException {

		++count;

		if( n == 1 ) { // 원 판이 1개 일 때
			sb.append( from + " " + to + "\n" );
			return;
		}else { // 원 판이 1개가 아닐 때
			hanoi(n-1, from, to, by); // n - 1을 한 후, 1->3->2 로 원판 전달
			sb.append( from + " " + to + "\n" );
			hanoi(n-1, by, from, to); // n - 1을 한 후, 2->1->3 로 원판을 전달
		}

	}
}
