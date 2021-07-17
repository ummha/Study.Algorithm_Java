package _00_codingTest.programmers.level1.solution32;

public class Solution1 {
    public String solution1(int n) {
        final String su = "수";
        final String bak = "박";

        StringBuilder sb = new StringBuilder();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                sb.append(su);
            } else {
                cnt = 0;
                sb.append(bak);
            }
        }

        return sb.toString();
    }

    public String solution2(int n) {
        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution1(10000).length());
        System.out.println(solution1.solution2(10000).length());
    }
}
