package _00_codingTest.programmers.level1.solution06;

import java.util.Arrays;

public class Solution2 {
    
    // jdk 라이브러리를 활용한 솔루션
    public int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = s.solution(array, commands);
        System.out.println(Arrays.toString(result));
    }
}
