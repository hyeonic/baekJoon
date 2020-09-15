package baekJoon.stage19;

import java.io.*;
import java.util.Arrays;

// 19-2 1037 약수
public class Divisor {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());
        String[] nums = bufferedReader.readLine().split(" ");

        Arrays.sort(nums, (x, y) -> {
            return Integer.compare(Integer.parseInt(x), Integer.parseInt(y));
        });

        if (nums.length % 2 == 0) {
            int x = Integer.parseInt(nums[nums.length / 2]);
            int y = Integer.parseInt(nums[nums.length / 2 - 1]);
            bufferedWriter.write((x * y) + "");
        } else {
            int x = Integer.parseInt(nums[nums.length / 2]);
            bufferedWriter.write((x * x) + "");
        }

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();

    }

}