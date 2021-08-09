package _00_codingTest.backjoon._01_string._01_11654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void getAsciiCode1() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        char[] strArr = str.toCharArray();
        System.out.println((int)strArr[0]);
    }

    public static void getAsciiCode2() throws IOException {
        int code = System.in.read();
        System.out.println(code);
    }

    public static void main(String[] args) throws Exception {
        getAsciiCode1();
        getAsciiCode2();
    }
}
