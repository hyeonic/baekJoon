package baekJoon.stage09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 10-2 2581 소수
/*
	자연수 M과 N이 주어질 때 M이상 N 이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최소값을 찾는 프로그램을 작성하시오.
	예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97
	총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.

 */
public class PrimeNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = Integer.MAX_VALUE;

        boolean isPrime = true;

        if (m <= 10000 && n <= 10000) { // m과 n은 10000 이하 자연수

            for (int i = m; i <= n; ++i) { // m 부터 n 까지 반복
                isPrime = true;
                for (int j = 2; j < i; ++j) { // 2부터 k/2 까지 나누어지는 숫자가 존재하지 않으면 소수
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime && i != 1) { // 소수는 모두 더함
                    sum += i;
                }

                if (i < min && isPrime && i != 1) // 최소값을 저장
                    min = i;

            }

            if (sum == 0)
                bw.write(String.valueOf(-1) + "\n");
            else
                bw.write(sum + "\n" + min);

        } else {
            bw.write(String.valueOf(-1) + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
