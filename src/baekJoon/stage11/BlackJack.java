package baekJoon.stage11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 13-1 2798 블랙잭
public class BlackJack {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //System.out.println( "n : " + n + " m : " + m );

        st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> cards = new ArrayList();
        while (st.hasMoreTokens()) {
            int card = Integer.parseInt(st.nextToken());
            cards.add(card);
        }

//		for( int card : cards ) {
//			System.out.println( "card : " + card );
//		}

        // num1 + num2 + num3 가 m과 같거나 가장 근처에 있는 값이 되어야 한다.
        for (int i = 0; i < cards.size(); ++i) { // i => num1
            int num1 = cards.get(i);
            for (int j = 0; j < cards.size(); ++j) { // j => num2
                int num2 = cards.get(j);
                for (int k = 0; k < cards.size(); ++k) { // k => num3
                    int num3 = cards.get(k);
                    if (i != j && i != k && j != k) {
                        //System.out.println( "num1 : " + num1 + " num2 : " + num2 + " num3 : " + num3 );
                        int temp = num1 + num2 + num3;
                        if (temp <= m && result <= temp) {
                            result = temp;
                        }
                    }
                }
            }
        }

        bw.write(result + "");

        bw.flush();
        br.close();
        bw.close();
    }
}
