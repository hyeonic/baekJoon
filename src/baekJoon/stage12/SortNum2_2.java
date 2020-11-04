package baekJoon.stage12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 14-2 mergeSort 활용
public class SortNum2_2 {
    static int result[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        result = new int[n];
        int[] intArray = new int[n];

        for (int i = 0; i < n; ++i) {
            intArray[i] = Integer.parseInt(br.readLine());
        }

        if (n != 1) {
            mergeSort(0, n - 1, intArray);
        } else {
            result[0] = intArray[0];
        }

        for (int i = 0; i < n; ++i) {
            bw.write(result[i] + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void mergeSort(int l, int r, int[] intArray) {
        int mid;
        if (l < r) {
            mid = (l + r) / 2;
            mergeSort(l, mid, intArray);
            mergeSort(mid + 1, r, intArray);
            merge(l, mid, r, intArray);
        }
    }

    public static void merge(int left, int mid, int right, int[] intArray) {
        int l = left;
        int m = mid + 1;
        int k = left;

        while (l <= mid || m <= right) {
            if (l <= mid && m <= right) {
                if (intArray[l] <= intArray[m]) {
                    result[k] = intArray[l++];
                } else {
                    result[k] = intArray[m++];
                }
            } else if (l <= mid && m > right) {
                result[k] = intArray[l++];
            } else {
                result[k] = intArray[m++];
            }
            k++;
        }
        for (int i = left; i < right + 1; ++i) {
            intArray[i] = result[i];
        }
    }
}
