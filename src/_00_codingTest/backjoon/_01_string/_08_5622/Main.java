package _00_codingTest.backjoon._01_string._08_5622;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int time = 0;
        while (true) {
            int c = System.in.read();

            if(c == 10) break;

            if(86 < c) time+=10;
            else if(83 < c) time += 9;
            else if(79 < c) time += 8;
            else if(76 < c) time += 7;
            else if(73 < c) time += 6;
            else if(70 < c) time += 5;
            else if(67 < c) time += 4;
            else time += 3;
        }
        System.out.println(time);
    }
}
