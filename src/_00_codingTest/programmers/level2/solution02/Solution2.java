package _00_codingTest.programmers.level2.solution02;

public class Solution2 {
    public String solution(int n) {
        String[] num = {"4","1","2"};
        String answer = "";

        while(n > 0){
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution(2));
    }
}
