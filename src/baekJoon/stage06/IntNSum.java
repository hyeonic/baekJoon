package baekJoon.stage06;

public class IntNSum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(sum(a));

    }

    static long sum(int[] a) {
        long ans = 0;

        if (a.length >= 1 && a.length <= 3000000) {
            for (int i = 0; i < a.length; ++i) {
                if (a[i] >= 0 && a[i] <= 1000000) {
                    ans += a[i];
                }
            }
        }
        return ans;
    }
}

