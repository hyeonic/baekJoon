package baekJoon.stage13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 15-5 9663 N-Queen
public class N_Queen {

    static int n;
    static int count;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; ++i) {
            int[] col = new int[n]; // col 배열 선언 및 생성

            col[0] = i; // 0행 i열에 퀸을 놓고 start
            backtracking(col, 0);
        }

        bw.write(count + "");

        bw.flush();
        br.close();
        bw.close();
    }

    // row 행까지 퀀을 놓는다.
    // row + 1 행에 퀸을 놓을 수 있는지 확인한다.
    // 만약 row 값이 n과 같다면 n행까지 퀸을 놓았다는 말이므로 count를 1 증가시켜준다.
    static void backtracking(int[] col, int row) {
        if ((n - 1) == row) {
            count++;
        } else {
            for (int i = 0; i < n; ++i) { // 0 ~ i까지 열까지 반복
                col[row + 1] = i;
                if (isPosible(col, row + 1)) {
                    backtracking(col, row + 1);
                }
            }
        }
    }

    static boolean isPosible(int[] col, int row) {

        for (int i = 0; i < row; ++i) {
            if (col[i] == col[row]) {
                return false;
            }
            if (Math.abs(i - row) == Math.abs(col[i] - col[row])) {
                return false;
            }
        }
        return true;
    }
}
