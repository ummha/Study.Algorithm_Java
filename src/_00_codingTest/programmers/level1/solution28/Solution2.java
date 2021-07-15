package _00_codingTest.programmers.level1.solution28;

import java.util.Arrays;

public class Solution2 {

    public String solution(String str){
        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution("Zbcdefg"));
    }
}
