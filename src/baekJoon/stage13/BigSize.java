package baekJoon.stage13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 13-3	7568 덩치
public class BigSize {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Person> persons = new ArrayList();

		int size = Integer.parseInt( br.readLine() );

		for( int i = 0; i < size; ++i ) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int weight = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			Person person = new Person(weight, height);
			persons.add(person);
		}

//		for( Person p : persons ) {
//			System.out.println("person weight : " + p.weight +
//					" person height : " + p.height +
//					" person rank : " + p.rank );
//		}

		for( Person p1 : persons ) {
			for( Person p2 : persons ) {
				if( p1 != p2 ) {
					if( p1.weight < p2.weight && p1.height < p2.height ) {
						p1.rank += 1;
					}
				}
			}
		}

//		System.out.println("=====================================================================");
//
//		for( Person p : persons ) {
//			System.out.println("person weight : " + p.weight +
//					" person height : " + p.height +
//					" person rank : " + p.rank );
//		}

		for( Person p : persons ) {
			bw.write(p.rank + " ");
		}

		bw.flush();
		br.close();
		bw.close();
	}

	static private class Person {
		private int weight;
		private int height;
		private int rank;

		public Person(int w, int h) {
			this.weight = w;
			this.height = h;
			this.rank = 1;
		}
	}
}
