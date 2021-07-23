package _00_codingTest.programmers.level1.solution43;

import java.util.Arrays;

public class Solution1 {

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = (n * m) / answer[0];
        return answer;
    }

    public int gcd(int n, int m) {
        while (m > 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }

    /**
     * 재귀함수 활용
     * @param p
     * @param q
     * @return
     */
    public static int gcd2(int p, int q){
        if (q == 0) return p;
        return gcd2(q, p%q);
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 12;
        Solution1 solution1 = new Solution1();
        System.out.println(Arrays.toString(solution1.solution(num1, num2)));
    }
}
