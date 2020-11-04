package baekJoon.stage07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;

// 1157
public class WordStudy {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

        String[] wordArray = br.readLine().toUpperCase().split("");
        int max = 0;
        int maxCount = 0;
        String maxKey = "";

        for (int i = 0; i < wordArray.length; ++i) {
            if (wordMap.containsKey(wordArray[i])) {
                int count = wordMap.get(wordArray[i]);
                //System.out.println(" before remove contain key : " + wordArray[i] + " || wordMap.get(wordArray[i]) : " + wordMap.get(wordArray[i]));
                wordMap.remove(wordArray[i]);
                wordMap.put(wordArray[i], ++count);
                //System.out.println(" after remove contain key : " + wordArray[i] + " || wordMap.get(wordArray[i]) : " + wordMap.get(wordArray[i]));

                if (max < count)
                    max = count;

            } else {
                wordMap.put(wordArray[i], 0);
            }
        }

        Iterator<String> keys = wordMap.keySet().iterator();

        //System.out.println("max : " + max);

        while (keys.hasNext()) {
            String key = keys.next();
            if (max == wordMap.get(key)) {
                ++maxCount;
                maxKey = key;
            }
        }

        if (maxCount > 1)
            bw.write("?\n");
        else
            bw.write(maxKey + "\n");


        br.close();
        bw.close();
    }
}
