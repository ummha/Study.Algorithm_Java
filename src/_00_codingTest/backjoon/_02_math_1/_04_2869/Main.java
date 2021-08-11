package _00_codingTest.backjoon._02_math_1._04_2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer arr = new StringTokenizer(br.readLine().trim());
        int A = Integer.parseInt(arr.nextToken());  // 올라가는 A미터
        int B = Integer.parseInt(arr.nextToken());  // 내려가는 B미터
        int V = Integer.parseInt(arr.nextToken());  // 나무 높이 V미터
        // 식이 나누어 떨어지지 않는다는 거는 마지막 쯤에 남은 높이가 있어서임
        System.out.println(
                (V - B - 1) / (A - B) + 1
        );
    }
}
