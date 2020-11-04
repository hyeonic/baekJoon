package baekJoon.stage13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 15-6 2580 스도쿠
public class Sudoku {

    static private class Loc {
        private int x;
        private int y;

        public Loc(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[][] sudoku = new int[9][9];
    static ArrayList<Loc> locs = new ArrayList();
    static boolean check = false;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 9; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; ++j) {
                sudoku[i][j] = Integer.parseInt(st.nextToken());
                if (sudoku[i][j] == 0) {
                    Loc loc = new Loc(i, j);
                    locs.add(loc);
                }
            }
        }

        backtracking(0, 0); // index, count

        bw.flush();
        br.close();
        bw.close();
    }

    static void backtracking(int index, int count) {

        if (count == locs.size()) {
            print();
            check = true;
            return;
        }

        if (check)
            return;
        if (index >= locs.size())
            return;

        int x = locs.get(index).x;
        int y = locs.get(index).y;

        for (int i = 1; i <= 9; ++i) {
            if (isPosible(x, y, i)) {
                sudoku[x][y] = i;
                backtracking(index + 1, count + 1);
                sudoku[x][y] = 0;
            }
        }

    }

    static boolean isPosible(int x, int y, int num) {


        for (int i = 0; i < 9; ++i) {
            if (sudoku[x][i] == num) {
                return false;
            }
        }

        for (int i = 0; i < 9; ++i) {
            if (sudoku[i][y] == num) {
                return false;
            }
        }

        int tempX = x / 3 * 3;
        int tempY = y / 3 * 3;

        for (int i = tempX; i < tempX + 3; ++i) {
            for (int j = tempY; j < tempY + 3; ++j) {
                if (sudoku[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    static void print() {
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
}
