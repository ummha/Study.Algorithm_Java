package _00_codingTest.programmers.level1.solution40;

public class Solution1 {

    public long solution1(long n) {
        long l = Long.parseLong(String.valueOf((int) Math.sqrt(n)));

        if ((l * l) != n) return -1;
        else return (l + 1) * (l + 1);
    }

    public long solution2(long n) {
        if (Math.pow((int) Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
    }

    public long solution3(long n) {

        double i = Math.sqrt(n);

        return Math.floor(i) == i ? (long) Math.pow(i + 1, 2) : -1;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution1(121));
        System.out.println(solution1.solution2(121));
        System.out.println(solution1.solution3(121));
    }
}
