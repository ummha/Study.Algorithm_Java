package _00_codingTest.programmers.level1.solution23;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution1 {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(arr[0]);

        for(int i=1; i<arr.length; i++)
            if (arr[i] != arr[i - 1]) list.add(arr[i]);

        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++)  answer[i] = list.get(i);

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        Solution1 solution1 = new Solution1();
        System.out.println(Arrays.toString(solution1.solution(arr)));
    }
}
