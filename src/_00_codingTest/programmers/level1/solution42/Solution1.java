package _00_codingTest.programmers.level1.solution42;

public class Solution1 {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(0));
    }
}
