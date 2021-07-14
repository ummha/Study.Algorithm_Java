package _00_codingTest.programmers.level1.solution25;

public class Solution3 {

    /**
     * 등차수열의 합 공식
     * @param a
     * @param b
     * @return
     */
    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.solution(0, 9999999));
    }
}
