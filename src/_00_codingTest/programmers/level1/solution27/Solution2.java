package _00_codingTest.programmers.level1.solution27;

public class Solution2 {

    /**
     * filter() 람다를 활용한 솔루션
     * @param s
     * @return
     */
    boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution("pPoooyY"));
    }
}
