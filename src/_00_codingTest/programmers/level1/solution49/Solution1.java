package _00_codingTest.programmers.level1.solution49;

import java.util.Arrays;

public class Solution1 {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < answer.length; i++)
            answer[i] = answer[i - 1] + x;

        return answer;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(Arrays.toString(solution1.solution(-4, 2)));
    }
}
