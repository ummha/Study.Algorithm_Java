package _00_codingTest.backjoon._03_math_2._02_2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int minimum = 0;
        int total = 0;
        for (int i = M; i <= N; i++) {
            boolean isDecimal = true;
            if(i < 2) continue;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isDecimal = false;
                    break;
                }
            }
            if (isDecimal) {
                if(minimum == 0) minimum = i;
                total+=i;
            }
        }
        if (total == 0) {
            System.out.println(-1);
        } else {
            System.out.println(total);
            System.out.println(minimum);
        }
    }
}
