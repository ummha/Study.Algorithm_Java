package _00_codingTest.programmers.level1.solution35;

public class Solution1 {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n/2; i++) {
            if(n % i == 0) answer+=i;
        }
        return answer+n;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(12));
    }
}
