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
        int[] student = new int[n];  // 전체학생수 만큼의 가변배열 선언 초기화
        int answer = n; // 체육수업을 들을 수 있는 학생 수 선언 초기화 (default: 전체학생수)

        // 체육복 잃어버린 학생을 전체학생 배열의 index에 맞춰서 값은 -1로 대입
        for (int l : lost)
            student[l - 1]--;
        // 여분의 체육복을 가진 학생을 전체학생 배열의 index에 맞춰서 값을 1로 대입
        for (int r : reserve)
            student[r - 1]++;

        /**
         * 기대효과 : int[] student에  1을 가진 인덱스는 여분 체육복을 가진 학생
         * -1을 가진 인덱스는 체육복을 도난당한 학생
         * 0을 가진 인덱스는 여분을 가지지고 잃어버리지도 않은 학생(체육수업 참여 가능)
         * 그리고 여분을 가지고 있으면서 도난당한 학생은 해당 인덱스 값이 0이 됨.
         */

        for (int i = 0; i < student.length; i++) {
            // 해당 인덱스가 도난당한 학생일시 (도난당한 학색 = -1)
            if (student[i] == -1) {
                // 해당 인덱스 앞의 인덱스의 값이 1로 여분의 체육복을 가진 학생일시
                if (i - 1 >= 0 && student[i - 1] == 1) {
                    student[i]++;   // 해당 인덱스 값을 +1 해준다.
                    student[i - 1]--;   // 앞의 인덱스 값을 -1 해준다.
                // 해당 인덱스 뒤의 인덱스의 값이 1로 여분의 체육복을 가진 학생일시
                } else if (i + 1 < student.length && student[i + 1] == 1) {
                    student[i]++;   // 해당 인덱스 값을 +1 해준다.
                    student[i + 1]--;   // 뒤의 인덱스 값을 -1 해준다.
                } else  // 만일 앞뒤의 인덱스 값이 1이 아니면 체육수업을 들을 수 있는 학생 수 -1
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
