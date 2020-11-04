package baekJoon.stage07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

// 2941 크로아티아 알파벳
public class CroatiaAlphabet {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<String> croatiaList = new ArrayList<String>();

        croatiaList.add("c=");
        croatiaList.add("c-");
        croatiaList.add("dz=");
        croatiaList.add("d-");
        croatiaList.add("lj");
        croatiaList.add("nj");
        croatiaList.add("s=");
        croatiaList.add("z=");

        String input = br.readLine();

        for (String value : croatiaList) {
            if (input.contains(value)) {
                //System.out.println(" Before input String : " + input + " || replace value : " + value);
                input = input.replaceAll(value, "1");
                //System.out.println(" After input String : " + input);
            }
        }

        bw.write(String.valueOf(input.length()) + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
