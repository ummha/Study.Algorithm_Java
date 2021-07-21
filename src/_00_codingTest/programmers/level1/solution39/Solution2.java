package _00_codingTest.programmers.level1.solution39;

public class Solution2 {
    String res = "";

    public long solution(long n) {
        Long.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char) c) + res);
        return Long.parseLong(res);
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution(118372));
    }
}
