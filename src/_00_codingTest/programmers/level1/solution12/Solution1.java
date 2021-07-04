package _00_codingTest.programmers.level1.solution12;

public class Solution1 {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<absolutes.length; i++)
            answer += signs[i] ? absolutes[i] : absolutes[i]*-1;

        return answer;
    }

    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] sign = {true,false,true};
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(absolutes, sign));
    }
}
