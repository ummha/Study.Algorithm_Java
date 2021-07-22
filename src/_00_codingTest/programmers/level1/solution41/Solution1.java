package _00_codingTest.programmers.level1.solution41;

import java.util.Arrays;

public class Solution1 {
    public int[] solution(int[] arr) {
        int[] minus1 = {-1};
        if(arr.length <= 1) return minus1;

        int min = arr[0];
        for (int i : arr) if (i < min) min = i;

        int idx = 0;
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != min) newArr[idx++] = arr[i];
        }

        if(newArr.length <= 1) return minus1;

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {4,3,2,1};
        int[] arr2 = {10};
        Solution1 solution1 = new Solution1();
        System.out.println(Arrays.toString(solution1.solution(arr1)));
        System.out.println(Arrays.toString(solution1.solution(arr2)));
    }
}
