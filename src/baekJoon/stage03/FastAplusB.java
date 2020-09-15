package baekJoon.stage03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 3-4 15552 빠른 A + B
public class FastAplusB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < n; ++i) {
            String readLine = br.readLine();
            int a = Integer.parseInt(readLine.split(" ")[0]);
            int b = Integer.parseInt(readLine.split(" ")[1]);

            bw.write((a + b) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
