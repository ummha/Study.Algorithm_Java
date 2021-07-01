package _00_codingTest.programmers.level1.solution06;

import java.util.Arrays;

public class Solution1 {

    public int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];
        for(int idx=0; idx<commands.length; idx++){
            int i = commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];

            Integer[] newArr = new Integer[j-i+1];
            int y=0;
            for(int x = i-1; x<j; x++){
                newArr[y++] = array[x];
            }

            Arrays.sort(newArr);

            answer[idx] = newArr[k-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = s.solution(array, commands);
        System.out.println(Arrays.toString(result));
    }
}
