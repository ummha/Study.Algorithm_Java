package _00_codingTest.programmers.level1.solution30;

import java.util.Arrays;

public class Solution1 {

    /**
     * 전체 탐색
     * @param seoul
     * @return
     */
    public String solution1(String[] seoul) {
        String answer = "";

        int x = 0;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                x = i;
                break;
            }
        }

        return "김서방은 " + x + "에 있다";
    }

    /**
     * List의 indexOf()를 활용한 솔루션
     * @param seoul
     * @return
     */
    public String solution2(String[] seoul) {
        int x = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + x + "에 있다";
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution1.solution1(seoul));
        System.out.println(solution1.solution2(seoul));
    }
}
