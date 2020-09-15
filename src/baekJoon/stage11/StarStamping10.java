package baekJoon.stage11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 11-3 2447 별 찍기 - 10
public class StarStamping10 {
    static char[][] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        arr = new char[n][n];

        star(0, 0, n, false);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(arr[i][j]);
            }
            bw.write('\n');
        }


        bw.flush();
        br.close();
        bw.close();
    }

    static void star(int x, int y, int n, boolean blank) {

        // 공백칸일 경우
        if (blank) {
            for (int i = x; i < x + n; ++i) {
                for (int j = y; j < y + n; ++j) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        // 더 이상 쪼갤 수 없는 블록일 때
        if (n == 1) {
            arr[x][y] = '*';
            return;
        }


		/*
		 	n = 27 일 경우 한 block의 사이즈는 9
		 	n = 9 일 경우 한 block의 사이즈는 3
		 	해당 block의 한 칸을 담을 변수를 의미하는 size
		 */

        int size = n / 3;
        int count = 0;
        for (int i = x; i < x + n; i += size) {
            for (int j = y; j < y + n; j += size) {
                count++;
                if (count == 5) { // 공백 칸일 경우
                    star(i, j, size, true);
                } else {
                    star(i, j, size, false);
                }
            }
        }
    }
}
