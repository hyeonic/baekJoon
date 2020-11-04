package baekJoon.stage13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// 15-7 14888 연산자 끼워넣기
public class InsertOperator {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int n;
    static int[] intArray;
    static int[] operator; // + - / *
    static ArrayList<Integer> result;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    ;

    public static void main(String[] args) throws IOException {

        result = new ArrayList();

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        intArray = new int[n];

        for (int i = 0; i < n; ++i) {
            intArray[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        operator = new int[4];

        for (int i = 0; i < 4; ++i) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        backtracking(1, intArray[0]);
        Collections.sort(result);

        bw.write(result.get(result.size() - 1) + "\n");
        bw.write(result.get(0) + "");

        bw.flush();
        br.close();
        bw.close();
    }

    static void backtracking(int count, int sum) {

//		System.out.println( "count : " + count + " sum : " + sum );

        if (n == count) { // n번 진행하면 result list에 add			
//			for( int i = 0; i < n; ++i ) {
//				System.out.print( intArray[i] + " " );
//			}
//			System.out.println( "= " + sum );
            result.add(sum);
        }

        for (int i = 0; i < 4; ++i) { // 모든 연산자를 확인

            if (operator[i] != 0) {

                --operator[i]; // 사용된 연산자 --

                if (i == 0) {
                    backtracking(count + 1, sum + intArray[count]);
                } else if (i == 1) {
                    backtracking(count + 1, sum - intArray[count]);
                } else if (i == 2) {
                    backtracking(count + 1, sum * intArray[count]);
                } else if (i == 3) {
                    backtracking(count + 1, sum / intArray[count]);
                }

                ++operator[i]; // 사용이 끝났으면 ++
            }
        }
    }
}
