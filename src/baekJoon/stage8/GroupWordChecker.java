package baekJoon.stage8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class GroupWordChecker {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] tempStrArray = br.readLine().split("");

		HashMap<String, String> strMap = new HashMap<String, String>();

		bw.flush();
		br.close();
		bw.close();
	}

}
