package _00_codingTest.programmers.level1.solution21;

public class Solution2 {

    /**
     * replaceAll()을 활용한 솔루션 (가독성도 더 좋음)
     * @param s
     * @return
     */
    public int solution(String s) {
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i],digits[i]);
        }

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution("23four5six7"));
    }
}
