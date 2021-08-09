package _00_codingTest.backjoon._01_string._10_1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = N;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.setLength(0);
            sb.append(br.readLine().trim());
            int check = 1;
            for (int j = 0; j < sb.length(); j++) {
                char c = sb.charAt(j);
                int first = sb.indexOf(String.valueOf(c));
                int last = sb.lastIndexOf(String.valueOf(c), j);
                for (int k = first; k < last; k++) {
                    if (sb.charAt(k) != c) {
                        check = 0;
                        break;
                    }
                }
                if (check == 0) {
                    result--;
                    break;
                }
            }
        }
        System.out.println(result);
        br.close();
    }
}
