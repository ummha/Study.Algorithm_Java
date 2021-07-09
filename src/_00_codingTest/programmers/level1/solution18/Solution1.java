package _00_codingTest.programmers.level1.solution18;

import java.util.Calendar;

public class Solution1 {

    /**
     * JDK Calandar를 활용한 솔루션
     * @param a
     * @param b
     * @return
     */
    public String solution(int a, int b) {
        final String[] DAY_OF_WEEK = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        Calendar c = Calendar.getInstance();
        c.set(2016, a-1, b);

        return DAY_OF_WEEK[c.get(Calendar.DAY_OF_WEEK)-1];
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(5, 24));
    }
}
