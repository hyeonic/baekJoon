package baekJoon.stage09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 9-10 1011 Fly me to the Alpha Centauri
/*

	1. max 가 1 씩 증가하면서 2 번씩 반복된다.
	2. Distance는 이 전 거리와 최대값과의 차이가 max가 증가하는 규칙과 동일하다.
	3. max가 변하는 지점의 distance는 max의 제곱 값이다.

	<규칙 1>
	max의 값은 distance의 루트 값에서 소수점을 버린 정수값이랑 같다.
	max = (int) Math.sqrt (distance);

	<규칙 2>
	max가 변하는 지점과 다음 지점사이에는 항상 count가 두 번씩 변한다.

	<규칙 3>
	max가 distance에 완전한 제곱근이 된 차례 다음 count가 변한다.

	<규칙 4>
	max값이 변할 때의 count는 다음 수식을 따른다.

	https://st-lab.tistory.com/79
 */

public class FlyMeToTheAlphaCentauri {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int distance = y - x; // 거리
            int max = (int) Math.sqrt(distance); // max가 변하는 지점의 제곱근. 소수점 버림

            if (max == Math.sqrt(distance)) { // distance의 제곱근이 정수로 딱 떨어진다면 규칙
                bw.write(String.valueOf(2 * max - 1) + "\n");
            } else if (distance <= (max * max + max)) {
                bw.write(String.valueOf(2 * max) + "\n");
            } else {
                bw.write(String.valueOf(2 * max + 1) + "\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
