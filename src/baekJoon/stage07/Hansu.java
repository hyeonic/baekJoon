package baekJoon.stage07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1065
public class Hansu {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            for (int i = 1; i <= n; ++i) {
                if (hansu(i)) {
                    count += 1;
                }
            }

            System.out.println(count);

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean hansu(int n) {

        int dif = Integer.MAX_VALUE;
        int tempDif = 0;

        if (n < 100) {
            return true;
        }
        if (n > 99) {
            String[] num = Integer.toString(n).split("");

            for (int i = 0; i < num.length; ++i) {
                if (i > 0 && i == 1) {
                    tempDif = Integer.parseInt(num[1]) - Integer.parseInt(num[0]);
                } else if (i >= 2) {
                    dif = Integer.parseInt(num[i]) - Integer.parseInt(num[i - 1]);
                    if (tempDif != dif) {
                        return false;
                    }
                }
            }
            return true;
        }
        return true;
    }
}
