package baekJoon.stage08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 5622 다이얼
public class Dial {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine().toUpperCase();
		char[] charArray = str.toCharArray();
		int sum = 0;

		for (int i = 0; i < charArray.length; ++i ) {

			switch( charArray[i] ) {
				case 'A' : case 'B' : case 'C' : sum += 2; break;
				case 'D' : case 'E' : case 'F' : sum += 3; break;
				case 'G' : case 'H' : case 'I' : sum += 4; break;
				case 'J' : case 'K' : case 'L' : sum += 5; break;
				case 'M' : case 'N' : case 'O' : sum += 6; break;
				case 'P' : case 'Q' : case 'R' : case 'S' : sum += 7; break;
				case 'T' : case 'U' : case 'V' : sum += 8; break;
				case 'W' : case 'X' : case 'Y' : case 'Z' : sum += 9; break;

				default : break;

			}
		}

		bw.write(String.valueOf(sum + charArray.length));

		bw.flush();
		br.close();
		bw.close();
	}

}
