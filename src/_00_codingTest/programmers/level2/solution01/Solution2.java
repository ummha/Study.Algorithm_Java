package _00_codingTest.programmers.level2.solution01;

public class Solution2 {
    public int solution(String s) {
        int min = s.length();
        int len = s.length()/2+1;
        for(int i = 1; i < len; i++) {
            String before = "";
            int sum = 0;
            int cnt = 1;
            for(int j = 0; j < s.length();) {
                int start = j;
                j = (j+i > s.length()) ? s.length():j+i;
                String temp = s.substring(start, j);
                if(temp.equals(before)) {
                    cnt++;
                } else {
                    if(cnt != 1) {
                        sum += (int)Math.log10(cnt)+1;
                    }
                    cnt = 1;
                    sum+=before.length();
                    before = temp;
                }
            }
            sum+=before.length();
            if(cnt != 1) {
                sum += (int)Math.log10(cnt)+1;
            }
            min = (min > sum) ? sum : min;
        }

        return min;
    }

    public static void main(String[] args) {
        String[] sArr = {"aabbaccc", "ababcdcdababcdcd", "abcabcdede", "abcabcabcabcdededededede", "xababcdcdababcdcd"};
        Solution2 solution2 = new Solution2();
        for (String s : sArr) {
            System.out.println(solution2.solution(s));
        }
    }
}
