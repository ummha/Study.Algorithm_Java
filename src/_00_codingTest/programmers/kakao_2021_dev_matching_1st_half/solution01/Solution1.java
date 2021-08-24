package _00_codingTest.programmers.kakao_2021_dev_matching_1st_half.solution01;

import java.util.Arrays;

public class Solution1 {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int win = 0;
        int zero = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++;
                continue;
            }

            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    win++;
                    break;
                }
            }
        }
        if (win == 6) {
            answer[1] = 1;
            answer[0] = 1;
        }else{
            int winMax = win + zero;
            answer[1] = getRank(win);
            answer[0] = getRank(winMax);
        }

        return answer;
    }

    public static int getRank(int score) {
        switch (score) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }

    public static void main(String[] args) {
        int[] lottos1 = {44, 1, 0, 0, 31, 25};
        int[] win_nums1 = {31, 10, 45, 1, 6, 19};
        int[] lottos2 = {0, 0, 0, 0, 0, 0};
        int[] win_nums2 = {38, 19, 20, 40, 15, 25};
        int[] lottos3 = {0, 8, 9, 10, 11, 12};
        int[] win_nums3 = {1, 2, 3, 4, 5, 6};
        Solution1 solution1 = new Solution1();
        System.out.println(Arrays.toString(solution1.solution(lottos1, win_nums1)));
        System.out.println(Arrays.toString(solution1.solution(lottos2, win_nums2)));
        System.out.println(Arrays.toString(solution1.solution(lottos3, win_nums3)));
    }
}
