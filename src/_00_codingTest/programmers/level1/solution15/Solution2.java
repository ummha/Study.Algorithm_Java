package _00_codingTest.programmers.level1.solution15;

public class Solution2 {
    /**
     * 가독성은 좋은데 속도가 Solution1보다 느리게 나옴
     * @param n
     * @return
     */
    public int solution(int n) {
        String a = "";

        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();


        return Integer.parseInt(a,3);
    }

    public static void main(String[] args) {
        int n = 125;
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution(n));
    }
}
