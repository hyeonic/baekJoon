package baekJoon.stage11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 11-1 10872 팩토리얼
public class Factorial {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(factorial(n) + "");

        bw.flush();
        br.close();
        bw.close();
    }

    public static int factorial(int n) {

        if (n <= 1) {
            return 1;
        } else
            return n * factorial(n - 1);
    }

}
