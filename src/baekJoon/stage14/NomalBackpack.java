package baekJoon.stage14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 16-16 12865 평범한 배낭
// knapsack 알고리즘
public class NomalBackpack {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Item> items = new ArrayList();
        int[][] dp = new int[n + 1][k + 1];

        items.add(new Item(0, 0));

        for (int i = 1; i <= n; ++i) {
            st = new StringTokenizer(br.readLine(), " ");
            int weight = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            Item item = new Item(weight, value);
            items.add(item);
        }

        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= k; ++j) {
                dp[i][j] = dp[i - 1][j];
                if (j - items.get(i).weight >= 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - items.get(i).weight] + items.get(i).value);
                }
            }
        }

        bw.write(dp[n][k] + "");

        bw.flush();
        br.close();
        bw.close();
    }

    private static class Item {
        private int weight;
        private int value;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }
}
