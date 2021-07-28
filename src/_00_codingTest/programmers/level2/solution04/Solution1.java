package _00_codingTest.programmers.level2.solution04;

import java.math.BigInteger;

public class Solution1 {
    public long solution1(int w, int h) {
        long wLong = w;
        long hLong = h;
        BigInteger bigW, bigH;
        bigW = new BigInteger(String.valueOf(w));
        bigH = new BigInteger(String.valueOf(h));
        return (wLong * hLong) - (wLong + hLong - (bigW.gcd(bigH)).longValue());
    }

    public long solution2(int w, int h) {
        long totalSquareArea = (long)w * (long)h;
        long crashedSquareArea = w + h - BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).longValue();
        return totalSquareArea - crashedSquareArea;
    }

    public static void main(String[] args) {
        int w = 11;
        int y = 13;
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution1(w, y));
        System.out.println(solution1.solution2(w, y));
    }
}
