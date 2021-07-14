package _00_codingTest.programmers.level1.solution25;

public class Solution1 {
    public long solution(int a, int b) {
        long answer = 0;

        if(a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        for(int i=a; i<=b; i++)
            answer += i;

        return answer;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(0, 9999999));
    }
}
