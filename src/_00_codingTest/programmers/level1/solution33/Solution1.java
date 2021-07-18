package _00_codingTest.programmers.level1.solution33;

public class Solution1 {

    public int solution1(String s) {
        return Integer.parseInt(s);
    }

    public int solution2(String s) {
        boolean Sign = true;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '-')
                Sign = false;
            else if (ch != '+')
                result = result * 10 + (ch - '0');
        }
        return Sign ? 1 : -1 * result;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution1("1234"));
        System.out.println(solution1.solution2("-1234"));
    }
}
