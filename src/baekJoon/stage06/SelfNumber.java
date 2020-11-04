package baekJoon.stage06;

import java.util.ArrayList;

// 4673
public class SelfNumber {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < 10001; ++i) {
            arrayList.add(d(i));
            //System.out.println(d(i));
        }

        for (int i = 0; i < 10001; ++i) {
            if (!arrayList.contains(i)) {
                System.out.println(i);
            }
        }
    }

    private static int d(int n) {

        int num = n;
        int sum = 0;

        while (num != 0) {

            sum += num % 10;
            num /= 10;
        }

        return (sum + n);
    }
}
