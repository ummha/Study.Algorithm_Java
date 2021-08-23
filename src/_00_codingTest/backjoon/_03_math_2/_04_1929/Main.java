package _00_codingTest.backjoon._03_math_2._04_1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean prime[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        prime = new boolean[N + 1];    // 배열 생성
        get_prime();

        StringBuilder sb = new StringBuilder();
        // 소수 출력
        for (int i = M; i <= N; i++) {
            if (prime[i] == false) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }


    // 에라토스테네스 체 알고리즘
    public static void get_prime() {
        // false == 소수
        prime[0] = prime[1] = true;
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;    // 이미 체크된 배열일 경우 skip
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
