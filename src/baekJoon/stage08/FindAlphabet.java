package baekJoon.stage08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// 10809
public class FindAlphabet {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");

			String[] strArray = (br.readLine()).split("");
			HashMap<String, Integer> alphabetMap = new HashMap<String, Integer>();

			for ( int i = 0; i < strArray.length; ++i ) {

				if (alphabetMap.containsKey(strArray[i])) {
					continue;
				}else {
					alphabetMap.put(strArray[i], i);
					//System.out.println("key: " + strArray[i] + " value: " + i);
				}

			}

			for (int i = 0; i < alphabet.length; ++i) {
				if (alphabetMap.containsKey(alphabet[i])) {
					System.out.print( alphabetMap.get(alphabet[i]) + " " );
				}else {
					System.out.print("-1 ");
				}
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
