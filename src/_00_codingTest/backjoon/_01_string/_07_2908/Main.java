package _00_codingTest.backjoon._01_string._07_2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().trim().split(" ");

        StringBuilder sb = new StringBuilder(strArr[0]);
        int a = Integer.parseInt(sb.reverse().toString());
        sb.setLength(0);
        sb.append(strArr[1]);
        int b = Integer.parseInt(sb.reverse().toString());
        System.out.println(a > b ? a : b);
    }
}
