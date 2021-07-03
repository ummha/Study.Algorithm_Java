package _00_codingTest.programmers.level1.solution10;

public class Solution1 {
    /**
     * 배열 크기를 벗어나는 문제 해결
     * @param n
     * @param lost
     * @param reserve
     * @return
     */
    public int solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];
        int answer = n;

        for (int l : lost)
            people[l - 1]--;
        for (int r : reserve)
            people[r - 1]++;

        for (int i = 0; i < people.length; i++) {
            if (people[i] == -1) {
                if (i - 1 >= 0 && people[i - 1] == 1) {
                    people[i]++;
                    people[i - 1]--;
                } else if (i + 1 < people.length && people[i + 1] == 1) {
                    people[i]++;
                    people[i + 1]--;
                } else
                    answer--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] lost = {3, 4};
        int[] reserve = {1, 3, 5};
        System.out.println(solution1.solution(5, lost, reserve));

    }
}
