package _00_codingTest.programmers.level1.solution34;

public class Solution1 {

    public String solution(String s, int n) {
        final int bound = 26 - n;
        final char[] cArr = s.toCharArray();

        for(int i=0; i<cArr.length; i++) {
            if(cArr[i] > 0x20)
                cArr[i] += (cArr[i] & 0x1F) <= bound? n : -bound;
        }

        return new String(cArr);
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution("AB", 1));
        System.out.println(solution1.solution("z", 1));
        System.out.println(solution1.solution("a B z", 4));
    }
}
