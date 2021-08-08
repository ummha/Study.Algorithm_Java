package _00_codingTest.backjoon._01_string._05_study_word_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().trim();
        word = word.toUpperCase();

        char result = '?';
        int[] arr = new int[26];
        int max = 0;

        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            int idx = c - 65;
            arr[idx]++;

            if (arr[idx] > max) {
                result = c;
                max = arr[idx];
            } else if (arr[idx] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }

    // 시간 초과 코드, DEAD
    public void overRuntimeCode(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().trim();
        StringBuilder sb = new StringBuilder(word.toUpperCase());

        String result = "";
        int totalMax = 0;
        while (sb.length() > 0) {
            int i = sb.length()-1;
            String charAt = String.valueOf(sb.charAt(i));
            int max = 0;
            while (true) {
                int idx = sb.indexOf(charAt);
                if (idx >= 0) {
                    max++;
                    sb.delete(idx, idx + 1);
                }else{
                    break;
                }
            }
            if(max > totalMax) {
                totalMax = max;
                result = charAt;
            } else if (max == totalMax) {
                result = "?";
                break;
            }
        }
        System.out.println(result);
    }
}
