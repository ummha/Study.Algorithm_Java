package _00_codingTest.programmers.level1.solution48;

import java.util.Arrays;

public class Solution1 {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i=0; i<arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4}, {5,6}};
        Solution1 solution1 = new Solution1();
        System.out.println(Arrays.deepToString(solution1.solution(arr1, arr2)));
    }
}
