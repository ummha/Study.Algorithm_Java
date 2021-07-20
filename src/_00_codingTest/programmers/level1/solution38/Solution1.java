package _00_codingTest.programmers.level1.solution38;

import java.util.Arrays;

public class Solution1 {
    public int[] solution1(long n) {
        int len = Long.toString(n).length();
        int[] answer = new int[len];

        int idx = 0;
        while (n != 0) {
            answer[idx++] = (int)(n % 10);
            n /= 10;
        }

        return answer;
    }

    public int[] solution2(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(Arrays.toString(solution1.solution1(12345)));
        System.out.println(Arrays.toString(solution1.solution2(123456789)));
    }
}
