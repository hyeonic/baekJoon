package baekJoon.stage08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

// 1316 그룹 단어 체커
public class GroupWordChecker {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		int result = 0;

		for ( int i = 0; i < count; i++ ) {

			String str = br.readLine().toLowerCase();
			String[] tempStrArray = str.split("");

			ArrayList<String> strList = new ArrayList<String>();
			String temp = "";

			boolean isDone = true;

			for ( String s : tempStrArray ) {
				if ( temp.equals("") ) {
					temp = s;
					strList.add(s);
				}else {
					if ( s.equals(temp) ) {
						strList.add(s);
					}else if ( strList.contains(s) ){
						isDone = false;
						System.out.println( str + " isDone? " + isDone);
						break;
					}
					strList.add(s);
					temp = s;
				}
			}

			System.out.println( str + " isDone? " + isDone);
			if ( isDone == true )
				++result;

		}

		bw.write( String.valueOf(result) );

		bw.flush();
		br.close();
		bw.close();
	}

}
