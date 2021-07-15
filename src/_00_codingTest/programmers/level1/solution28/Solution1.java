package _00_codingTest.programmers.level1.solution28;

import java.util.Arrays;
import java.util.Collections;

public class Solution1 {

    public String solution(String s) {
        String[] answer = s.split("");
        Arrays.sort(answer);
        Collections.reverse(Arrays.asList(answer));
        return String.join("", answer);
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution("Zbcdefg"));
    }
}
