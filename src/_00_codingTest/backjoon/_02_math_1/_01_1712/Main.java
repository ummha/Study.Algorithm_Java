package _00_codingTest.backjoon._02_math_1._01_1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * 한 대 비용: 고정비용(A) + 가변비용(B)
     * 한 대 가격: C
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().trim().split(" ");
        int A = Integer.parseInt(strArr[0]);
        int B = Integer.parseInt(strArr[1]);
        int C = Integer.parseInt(strArr[2]);
        int result = B < C ? (A / (C - B)) + 1 : -1;
        System.out.println(result);
    }
}
