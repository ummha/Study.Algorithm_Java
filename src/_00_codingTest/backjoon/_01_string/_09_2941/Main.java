package _00_codingTest.backjoon._01_string._09_2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int len = word.length();
        int count = 0;

        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);
            if (i < len - 1) {
                if (c == 'c' && (word.charAt(i + 1) == '=' || word.charAt(i + 1) == '-')) i++;
                else if (c == 'd') {
                    if (i < (len-2) && word.charAt(i + 1) == 'z' && word.charAt(i + 2) == '=') i+=2;
                    else if (word.charAt(i + 1) == '-') i++;
                }
                else if (c == 'l' && word.charAt(i + 1) == 'j') i++;
                else if (c == 'n' && word.charAt(i + 1) == 'j') i++;
                else if (c == 's' && word.charAt(i + 1) == '=') i++;
                else if (c == 'z' && word.charAt(i + 1) == '=') i++;
            }
            count++;
        }
        System.out.println(count);
    }
}
