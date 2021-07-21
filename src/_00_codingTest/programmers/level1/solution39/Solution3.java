package _00_codingTest.programmers.level1.solution39;

import java.util.Arrays;

public class Solution3 {
    public long solution(long n){
        String str = Long.toString(n);
        char[] c = str.toCharArray();
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder(new String(c,0,c.length));
        return Long.parseLong(((sb.reverse()).toString()));
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.solution(118372));
    }
}
