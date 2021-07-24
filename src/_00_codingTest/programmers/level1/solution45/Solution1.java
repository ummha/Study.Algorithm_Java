package _00_codingTest.programmers.level1.solution45;

import java.util.Arrays;

public class Solution1 {

    public double solution1(int[] arr) {
        double total = 0;

        for (int i = 0; i < arr.length; i++) total += arr[i];

        return total / arr.length;
    }

    public double solution2(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution1(arr));
        System.out.println(solution1.solution2(arr));
    }
}
