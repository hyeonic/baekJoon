package baekJoon.stage09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


// 9-4 1193 분수찾기 ★
// https://hongku.tistory.com/246
public class FindFractional {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        int line = 0;
        int count = 0;
        while (count < input) {
            ++line;
            count = line * (line + 1) / 2; // 등차수열의 법칙 n (n + 1) / 2 ( n : n번째 까지 항의 개수 )
        }

        //System.out.println( "line : " + line + " || count : " + count );

        int top;
        int bottom;

        if (line % 2 != 0) { // line이 홀수 일 때
            top = (count - input) + 1; // 화살표 방향으로 값이 작아진다.
            bottom = line - (count - input); // 화살표 방향으로 값이 커진다.
            //System.out.println( "top : " + top + " || bottom : " + bottom );
        } else { // line이 짝수 일 때
            top = line - (count - input); // 화살표 방향으로 값이 커진다.
            bottom = 1 + (count - input); // 화살표 방향으로 값이 작아진다.
            //System.out.println( "top : " + top + " || bottom : " + bottom );
        }

        bw.write(top + "/" + bottom);
        bw.flush();
        br.close();
        bw.close();
    }

}
