package _00_codingTest.programmers.level1.solution25;

public class Solution2 {

    /**
     * Solution1 보다 조금 더 깔끔한 for문 선언식
     * @param a
     * @param b
     * @return
     */
    public long solution(int a, int b) {
        long answer = 0;
        for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++)
            answer += i;

        return answer;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution(0, 9999999));
    }
}
