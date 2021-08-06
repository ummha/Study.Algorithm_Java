package _00_codingTest.backjoon._01_string._04_string_repeat_2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int s = Integer.parseInt(br.readLine());
        int i = 0;

        while (i++ < s)
            appendString(sb, br.readLine().trim().split(" "));
        br.close();

        String[] results = sb.toString().trim().split(" ");
        for(String result : results)
            System.out.println(result);
    }

    public static void appendString(StringBuilder sb, String[] P) {
        int repeat = Integer.parseInt(P[0]);
        char[] chrArr = P[1].toCharArray();
        for (char chr : chrArr) {
            int i=0;
            while (i++ < repeat) sb.append(chr);
        }
        sb.append(" ");
    }
}
