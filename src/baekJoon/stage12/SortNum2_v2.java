package baekJoon.stage12;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNum2_v2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in) );
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out) );

        int size = Integer.parseInt(bufferedReader.readLine());
        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < size; i++) {
            numbers.add(Integer.parseInt(bufferedReader.readLine()));
        }

        Collections.sort(numbers);

        for (int i = 0; i < size; i++) {
            bufferedWriter.write(numbers.get(i) + "\n");
        }

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }

}
