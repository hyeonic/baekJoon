package baekJoon.stage03;

import java.util.Scanner;

// 3-8 11022 A + B - 8
public class AplusBminus8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int a;
        int b;
        Num[] num;

        n = sc.nextInt();
        num = new Num[n];

        for (int i = 0; i < n; ++i) {

            num[i] = new Num();

            num[i].setA(sc.nextInt());
            num[i].setB(sc.nextInt());

            if (num[i].getA() > 0 && num[i].getB() < 10)
                num[i].setSum(num[i].getA() + num[i].getB());
        }

        for (int i = 0; i < n; ++i) {
            System.out.println("Case #" + (i + 1) + ": " + num[i].getA() + " + " + num[i].getB() + " = " + num[i].getSum());
        }

    }

    static class Num {
        private int a;
        private int b;
        private int sum;

        public Num() {
        }

        ;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }
    }
}
