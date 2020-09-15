package baekJoon.stage08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 1152 단어의 개수
public class WordCount {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArray = br.readLine().split(" ");
        int count = 0;

        for (String key : strArray) {
            if (key.equals(""))
                --count;

            ++count;
        }

        bw.write(String.valueOf(count));

        bw.flush();
        br.close();
        bw.close();
    }

}
