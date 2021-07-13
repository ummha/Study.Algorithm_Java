package _00_codingTest.programmers.level1.solution24;

import java.util.Arrays;

public class Solution2 {

    /**
     * 스트림 함수형을 활용한 솔루션
     * @param arr
     * @param divisor
     * @return
     */
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        java.util.Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] arr = {2, 36, 1, 3};
        System.out.println(Arrays.toString(solution1.solution(arr, 1)));
    }
}
