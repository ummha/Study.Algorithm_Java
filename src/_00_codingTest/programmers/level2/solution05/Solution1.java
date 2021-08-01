package _00_codingTest.programmers.level2.solution05;

import java.util.Stack;

public class Solution1 {
    public int solution(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < arr.length; i++) {
            if (!stack.isEmpty() && stack.peek() == arr[i])
                stack.pop();
            else
                stack.push(arr[i]);
        }
        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution("baabaa"));
        System.out.println(solution1.solution("cdcd"));
    }
}
