package _00_codingTest.programmers.level1.solution08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {

    public static int[] solution(int[] answers) {
        int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] hit = new int[3];
        for(int i = 0; i < hit.length; i++) {
            for(int j = 0; j < answers.length; j++) {
                if(patterns[i][j % patterns[i].length] == answers[j]) hit[i]++;
            }
        }

        int max = Math.max(hit[0], Math.max(hit[1], hit[2]));
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < hit.length; i++)
            if(max == hit[i]) list.add(i + 1);

        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int num : list)
            answer[cnt++] = num;
        return answer;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] answers1 = {1,2,3,4,5};
        int[] result = solution1.solution(answers1);
        System.out.println(Arrays.toString(result));
        int[] answers2 = {1,3,2,4,2};
        result = solution1.solution(answers2);
        System.out.println(Arrays.toString(result));
    }
}




