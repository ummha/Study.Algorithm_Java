package _00_codingTest.backjoon._01_string._02_sum_11720;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String temp = bf.readLine();
        int sum = 0;
        for (byte b : bf.readLine().getBytes())
            sum += b - '0';
        System.out.println(sum);
    }

    public void otherSolution() throws Exception {
        InputStream is = System.in;
        while (is.read() != '\n') ;
        int sum = 0;
        int cur;
        while ((cur = is.read()) != '\n') {
            sum += cur - 48;
        }
        System.out.println(sum);
    }
}
