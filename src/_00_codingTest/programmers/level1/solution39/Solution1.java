package _00_codingTest.programmers.level1.solution39;

public class Solution1 {
    public long solution(long n) {
        char[] nArr = Long.toString(n).toCharArray();

        for (int i = 0; i < nArr.length; i++) {
            for (int j = 0; j < nArr.length - i - 1; j++) {
                if (nArr[j] < nArr[j + 1]) {
                    char tmp = nArr[j];
                    nArr[j] = nArr[j + 1];
                    nArr[j + 1] = tmp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : nArr) sb.append(Character.toString(c));

        return Long.parseLong(sb.toString());
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(118372));
    }
}
