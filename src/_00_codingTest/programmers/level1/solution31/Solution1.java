package _00_codingTest.programmers.level1.solution31;

public class Solution1 {

    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            arr[i] = i;
        }//0=1 n-1 =n이 된다
        arr[1] = 0;
        for (int i = 2; i <= n; i++) {//2부터 계산해줌
            if (arr[i] == 0)
                continue;
            for (int j = i + i; j <= n; j += i) {
                arr[j] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 1000000;
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(n));

    }
}
