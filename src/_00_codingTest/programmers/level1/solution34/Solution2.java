package _00_codingTest.programmers.level1.solution34;

public class Solution2 {

    public String solution(String s, int n) {
        return s.chars().map(c -> {
            int tmp = n % 26;
            if (c >= 'a' && c <= 'z') {
                return 'a' + (c - 'a' + tmp) % 26;
            } else if (c >= 'A' && c <= 'Z') {
                return 'A' + (c - 'A' + tmp) % 26;
            } else {
                return c;
            }
        }).mapToObj(c -> String.valueOf((char)c))
                .reduce((a, b) -> a + b).orElse("");
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution("AB", 1));
        System.out.println(solution2.solution("z", 1));
        System.out.println(solution2.solution("a B z", 4));
    }
}
