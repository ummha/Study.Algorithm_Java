package _00_codingTest.programmers.level1.solution14;

public class Solution1 {

    public int solution(int left, int right) {
        int answer = 0;

        for(int i=left; i<=right; i++){
            int cnt = 0;
            for(int j=1; j<=i; j++)
                if(i%j == 0) cnt++;
            answer += cnt%2 == 0 ? i : i*-1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(13, 17));
        System.out.println(solution1.solution(24, 27));
    }
}
