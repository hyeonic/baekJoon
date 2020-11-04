package baekJoon.stage12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

// 14-4 2108 통계학
public class Statistics {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        ArrayList<Integer> intList = new ArrayList();

        for (int i = 0; i < size; ++i) {
            intList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(intList);

        bw.write(Math.round(sum(intList) / size) + "\n");    // 산술평균 : N개의 수들의 합을 N으로 나눈 값
        bw.write(intList.get(size / 2) + "\n");            // 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
        bw.write(freValue(intList) + "\n");                                // 최빈값 : N개의 수들 중 가장 많이 나타나는 값
        bw.write(max(intList) - min(intList) + "\n");        // 범위 : N개의 수들 중 최댓값과 최솟값의 차이

        bw.flush();
        br.close();
        bw.close();
    }

    public static int max(ArrayList<Integer> intList) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < intList.size(); ++i) {
            if (max < intList.get(i)) {
                max = intList.get(i);
            }
        }
        return max;
    }

    public static int min(ArrayList<Integer> intList) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < intList.size(); ++i) {
            if (min > intList.get(i)) {
                min = intList.get(i);
            }
        }
        return min;
    }

    public static double sum(ArrayList<Integer> intList) {

        double sum = 0;

        for (int i = 0; i < intList.size(); ++i) {
            sum += intList.get(i);
        }

        return sum;
    }

    public static int freValue(ArrayList<Integer> intList) {

        HashMap<Integer, Integer> map = new HashMap();
        ArrayList<Integer> temp = new ArrayList();
        int maxKey = 0;
        int max = 0;

        for (int value : intList) {
            if (map.containsKey(value)) {
                int count = map.get(value);
                map.put(value, ++count);
            } else {
                map.put(value, 1);
            }
        }

        for (int key : map.keySet()) {
            if (max <= map.get(key)) {
                max = map.get(key);
            }
            //System.out.println("key : " + key + " count : " + map.get(key));
        }

        //System.out.println("max: " + max);

        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                temp.add(key);
            }
        }

        Collections.sort(temp);

        //System.out.println( "sorted temp : " + temp.toString() );

        if (temp.size() == 1) {
            return temp.get(0);
        } else {
            return temp.get(1);
        }
    }
}
