package baekJoon.stage08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 9-5 2869 달팽이는 올라가고 싶다. 이분탐색 풀이 ★ ★ ★

/*
	1. 나무막대의 첫 부분을 start, 정상을 end
	2. 중간지점을 달팽이가 올라가는 길이와 내려가는 길이의 차이로 나누어서 나온 값을 올려서 해당 지점에서 며칠이 걸렸는지 계산한다.

	※ 왜 중간지점을 차이값으로 나누고 올리고 하는 과정을 진행하는가? 달팽이의 위치가 낮과 밤의 반복에서 수학적인 규칙이 있다.
	달팽이의 위츠는 순차적으로 보면 다음과 같다.
	[1일차 낮] A -> [1일차 밤] A - B -> [2일차 낮] 2A - B -> [2일차 밤] 2A - 2B -> ...
	그렇다면 n 일차의 낮은 nA - (n-1)B, n일차의 밤은 nA - nB로 나타낼 수 있다.
	이 식을 정리해보면 n(A - B) + B, n(A + B)로 정리되므로 나눈 값의 올림값이 해당 지점의 경과 날짜인 것을 확인 할 수 있다.

	3. 해당 지점에서 낮에 움직인 거리로 종료조건을 검사한다.
		3-1. 전체 막대의 길이와 전체 막대의 길이에 올라가는 길이와 내려가는 길이의 차이를 더한 값의 사이에 있다면 종료
		3-2. 전체 막대의 길이와 올라가는 길이와 내려가는 길이의 차이를 더한 값 보다 크다면 end 값에 mid 값  할당
		3-3. 전체 막대의 길이보다 작다면 start 값에 mid값 할당

	※ 특정 날의 낮에 움직인 거리가 전체 막대보다 작다면 달팽이가 아직 더 가야한다는 뜻이고, 그 반대이면 달팽이가 이미 그 전에 도착했다는 뜻이다.
	전체 막대와 전체 막대에 올라가는 거리와 내려가는 거리의 차이를 더한 값의 사이에 있다는 것은 그 날 달팽이가 도착했다는 뜻이다.

	https://mug-log.tistory.com/31

 */

public class SnailByBS {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int start = 0;
        int end = v;

        while (true) {
            int mid = ((end + start) / 2);
            System.out.print("mid : " + mid + " || ");
            int n = (int) Math.ceil((double) mid / (a - b)); // 올림값이 해당 지점의 경과 날짜 인 것
            System.out.print("해당 지점의 경과 날짜 : " + n + " || ");
            int dayM = n * a - (n - 1) * b; // nA - (n-1)B
            System.out.println("dayM : " + dayM);

            if (dayM >= v && dayM < (v + (a - b))) {
                // 전체 막대의 길이와 전체 막대의 길이에 올라가는 길이와 내려가는 길이의 차이를 더한 값의 사이에 있다면
                System.out.println(n);
                break;
            } else if (dayM > v) {
                // 전체 막대의 길이와 올라가는 길이와 내려가는 길이의 차이를 더한 값 보다 크다면 end 값에 mid 값  할당
                System.out.println("end값 교체 " + end + " -> " + mid);
                end = mid;
            } else {
                // 전체 막대의 길이보다 작다면 start 값에 mid값 할당
                System.out.println("start값 교체 " + start + " -> " + mid);
                start = mid;
            }
        }

    }
}
