package _00_codingTest.backjoon._02_math_1._02_2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        int i = 0;
        int B = 1;
        while (true) {
            B += (6*i);
            if(N <= B) break;
            i++;
        }
        System.out.println(i+1);
    }
}
