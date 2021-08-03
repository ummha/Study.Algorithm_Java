package _00_codingTest.programmers.level2.solution07;

public class Solution1 {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    public int dfs(int[] numbers, int target, int depth, int sum) {
        int matchCount = 0;
        if (depth == numbers.length) {
            return sum == target ? 1 : 0;
        }
        matchCount += dfs(numbers, target, depth + 1, sum + numbers[depth]);
        matchCount += dfs(numbers, target, depth + 1, sum - numbers[depth]);
        return matchCount;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(numbers, 3));
    }
}
