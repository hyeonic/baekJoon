package baekJoon.stage12;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

// 12-5 1427 소트인사이드 v2
public class SortInside_v2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in) );
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out) );

        String[] numbers = bufferedReader.readLine().split("");

        Arrays.sort(numbers);
        Collections.reverse(Arrays.asList(numbers));

//        for (int i = numbers.length - 1; i >= 0; i--) {
//            bufferedWriter.write(numbers[i]);
//        }

        for (String number : numbers) {
            bufferedWriter.write(number);
        }

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();

    }

}
