package _00_codingTest.backjoon._03_math_2._01_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if(num > 1){
                boolean isDecimalNum = true;
                for (int i = 2; i <= num/2; i++) {
                    if(num % i == 0) {
                        isDecimalNum = false;
                        break;
                    }
                }
                if(isDecimalNum) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
