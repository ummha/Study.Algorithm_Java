package _00_codingTest.backjoon._01_string._06_1152;

import java.io.IOException;

public class Main2 {
    /**
     * 결국엔 아스키코드 값으로 입력받고 계산해야 속도가 빠르다.
     */
    public static void main(String[] args) throws IOException {
        int count = 0;
        int c;
        int pre = 32;

        while (true) {
            c = System.in.read();
            if (c == 32) {
                if (pre != 32)
                    count++;
            } else if (c == 10) {
                if (pre != 32)
                    count++;
                break;
            }
            pre = c;
        }
        System.out.println(count);
    }
}
