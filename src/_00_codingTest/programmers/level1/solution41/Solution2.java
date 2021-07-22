package _00_codingTest.programmers.level1.solution41;

import java.util.Arrays;

public class Solution2 {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) return new int[]{ -1 };
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {4,3,2,1};
        int[] arr2 = {10};
        Solution2 solution2 = new Solution2();
        System.out.println(Arrays.toString(solution2.solution(arr1)));
        System.out.println(Arrays.toString(solution2.solution(arr2)));
    }
}
