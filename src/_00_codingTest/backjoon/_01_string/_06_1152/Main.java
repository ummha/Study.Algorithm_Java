package _00_codingTest.backjoon._01_string._06_1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().trim().split(" ");
        int count = 0;
        for (String str : strArr)
            count += "".equals(str) || str == null ? 0 : 1;
        System.out.println(count);
    }
}
