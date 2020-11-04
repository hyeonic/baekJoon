package baekJoon.stage11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 13-2 2231 Digit Generator 분해합
public class DigitGenerator {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 0;
        boolean isDone = false;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; ++i) {
            int num = i;
            int temp = num;
            //System.out.println("temp: " + temp);
            while (num > 0) {
                temp += num % 10;
                //System.out.print("num%10: " + num%10 + " ");
                num /= 10;
                //System.out.println("num/10: " + num);
                //System.out.println("temp: " + temp);
            }
            if (n == temp) {
                result = i;
                //System.out.println("result: " + result);
                isDone = true;
                break;
            }

            isDone = false;
        }

        if (isDone) {
            bw.write(result + "");
        } else
            bw.write(0 + "");

        bw.flush();
        br.close();
        bw.close();
    }
}
