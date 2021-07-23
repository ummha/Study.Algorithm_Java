package _00_codingTest.programmers.level1.solution44;

public class Solution1 {

    public int solution(long num) {
        for(int i=0; i<499; i++){
            if(num == 1) return i;
            num = num%2==0 ? num / 2 : (num * 3) + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(1));
    }
}
