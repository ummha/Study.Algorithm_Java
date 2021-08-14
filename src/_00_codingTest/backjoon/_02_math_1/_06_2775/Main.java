package _00_codingTest.backjoon._02_math_1._06_2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int[] result = new int[testCase];

        int[][] fr = new int[15][15];
        for (int i = 0; i < 15; i++) {
            fr[i][0] = 1;
            fr[0][i] = i + 1;
        }
        for (int f = 1; f < 15; f++) {
            for (int r = 1; r < 15; r++) {
                fr[f][r] = fr[f - 1][r] + fr[f][r - 1];
            }
        }
        for (int i = 0; i < testCase; i++) {
            int k = Integer.parseInt(br.readLine()); // 층수
            int n = Integer.parseInt(br.readLine()); // 호수

            result[i] = fr[k][n-1];
        }

        for(int r : result) System.out.println(r);
    }
}
