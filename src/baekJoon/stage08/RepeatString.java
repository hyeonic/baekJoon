package baekJoon.stage08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 2675
public class RepeatString {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int tryCount = Integer.parseInt(br.readLine());

		if (tryCount >= 1 && tryCount <= 1000) {
			for ( int i = 0; i < tryCount; ++i ) {
				String[] tempArray = br.readLine().split(" ");
				int rep = Integer.parseInt(tempArray[0]);
				if (rep >= 1 && rep <= 8) {
					String[] array = tempArray[1].split("");
					if (array.length >= 1 && array.length <= 20) {
						for ( int j = 0; j < array.length; ++j ) {
							for ( int k = 0; k < rep; ++k ) {
								bw.write(array[j]);
							}
						}
					}
				}
				if(i != tryCount) {
					bw.write("\n");
				}

			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
