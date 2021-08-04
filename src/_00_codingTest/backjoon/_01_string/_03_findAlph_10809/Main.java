package _00_codingTest.backjoon._01_string._03_findAlph_10809;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder(bf.readLine());

        char c = 97;
        while (c < 123) {
            int idx = word.indexOf(String.valueOf(c));
            if(idx >= 0) {
                word.replace(idx, idx + 1, "").insert(idx, "0");
            }
            sb.append(idx+ " ");
            c++;
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb.toString());
    }
}
