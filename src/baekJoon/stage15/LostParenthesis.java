package baekJoon.stage15;

import java.io.*;

// 18-4 1541 잃어버린 괄호
public class LostParenthesis {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = bufferedReader.readLine();
        int result = 0;

        String[] minusSplit = n.split("\\-");

        result += add(minusSplit[0]);

        for (int i = 1; i < minusSplit.length; ++i) {
            result -= add(minusSplit[i]);
        }

        bufferedWriter.write(result + "");

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();

    }

    public static int add(String plusOperator) {
        String[] plusOperands = plusOperator.split("\\+");
        int sum = 0;
        for (String plusOperand : plusOperands) {
            sum += Integer.parseInt(plusOperand);
        }

        return sum;
    }

}
