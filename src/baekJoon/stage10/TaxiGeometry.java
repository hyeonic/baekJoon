package baekJoon.stage10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 10-9 3053 택시 기하학
/*
	유클리드 기하학
	 지금까지 우리가 배운 것은 유클리드 기하학을 기반으로 한다.

	둥그렇지 않은 원도 존재한다?
	 다른 지점을 거쳐 측정하면 둥그런 모양이 아니다. 좀 더 현실적이다.
 */
public class TaxiGeometry {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double r = Double.parseDouble(br.readLine()); // 반지름

        System.out.printf("%.6f \n", r * r * Math.PI);
        System.out.printf("%.6f", r * r * 2);

        bw.flush();
        br.close();
        bw.close();
    }

}
