package _00_codingTest.programmers.level1.solution24;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution1 {

    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0) list.add(arr[i]);
        }
        int[] answer;
        if(list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        list.sort((a,b)->a.compareTo(b));

        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) answer[i] = list.get(i);

        return answer;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] arr = {2, 36, 1, 3};
        System.out.println(Arrays.toString(solution1.solution(arr, 1)));
    }
}
