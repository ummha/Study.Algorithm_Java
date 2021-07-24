package _00_codingTest.programmers.level1.solution46;

public class Solution1 {

    public boolean solution(int x) {
        int sum = 0;
        int temp = x;
        while(temp > 0){
            sum += temp % 10;
            temp /= 10;
        }

        return x % sum == 0;
    }


    int sum2 = 0;
    public boolean solution2(int x) {
        sum2 = 0;
        Integer.toString(x).chars().forEach(c -> sum2 += c - '0');
        return x % sum2 == 0;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(12));
        System.out.println(solution1.solution2(13));
    }
}
