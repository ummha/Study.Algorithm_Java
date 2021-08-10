package _00_codingTest.backjoon._02_math_1._03_1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine().trim());
        int cell = 1;
        int start = 1;
        String result = start + "/" + start;

        if (X != start) {
            int L = 2;
            int plus = 2;
            while (true) {
                cell += plus;
                if (X <= cell) {
                    if (L % 2 == 0) { // 짝수일때
                        result = (L - (cell-X)) + "/" + (1 + (cell - X));
                    } else {    // 홀수 일때
                        result = (1 + (cell - X)) + "/" + (L - (cell-X));
                    }
                    break;
                }
                L++;
                plus++;
            }
        }
        System.out.println(result);
    }
}
