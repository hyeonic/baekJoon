package baekJoon.stage18;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// 18-2 1931 회의실 배정
public class AllocationOfconferenceRoom {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());
        ConferenceTime[] conferenceTimes = new ConferenceTime[n];
        int count = 0;

        for (int i = 0; i < n; ++i) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            ConferenceTime conferenceTime = new ConferenceTime(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
            conferenceTimes[i] = conferenceTime;
        }

        Arrays.sort(conferenceTimes, (x, y) -> {
            return Integer.compare(x.start, y.start);
        });

        Arrays.sort(conferenceTimes, (x, y) -> {
            return Integer.compare(x.end, y.end);
        });

//        for( ConferenceTime ct : conferenceTimes ) {
//            System.out.println( " start : " + ct.start + " || end : " + ct.end );
//        }

        count = 1;
        int start = conferenceTimes[0].start;
        int end = conferenceTimes[0].end;
        for (int i = 1; i < n; ++i) {
            if (end <= conferenceTimes[i].start) {
                start = conferenceTimes[i].start;
                end = conferenceTimes[i].end;
                count += 1;
            }
        }

        bufferedWriter.write(count + "");

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }

    private static class ConferenceTime {
        private int start;
        private int end;

        ConferenceTime(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
