package _00_codingTest.programmers.level1.solution03;

import java.util.Arrays;

public class Solution1 {
	int[] rankArr = {6, 5, 4, 3, 2, 1};
	
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		
		int winCnt = 0;
		int zeroCnt = 0;
		
		for(int i=0; i<lottos.length; i++) {
			boolean isZero =  (lottos[i] == 0);
			if(isZero) {
				zeroCnt++;
				continue;
			}
			
			for(int j=0; j<win_nums.length; j++) {
				winCnt += lottos[i] == win_nums[j] ? 1 : 0;
			}
		}
		
		answer[0] = getRank(winCnt + zeroCnt);
		answer[1] = getRank(winCnt);
		return answer;
	}
	
	// 순위 가져오기 case-1
	private int getRank(int cnt) {
		int rank = 6;
		if(cnt < 2) return rank;
		for(int i=0; i<rankArr.length; i++) {
			if(rankArr[i] == cnt) {
				rank = i+1;
				break;
			}
		}
		return rank;
	}
	
	// 순위 가져오기 case-2
	private int getRank1(int cnt) {
	        switch(cnt) {
	        case 6 :
	            return 1;
	        case 5 :
	            return 2;
	        case 4 :
	            return 3;
	        case 3 :
	            return 4;
	        case 2 :
	            return 5;
	        default :
	            return 6;
	    }
	}
	
	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int[] lottos1 = {44, 1, 0, 0, 31, 25};
		int[] win_nums1 = {31, 10, 45, 1, 6, 19};
		int[] lottos2 = {0, 0, 0, 0, 0, 0};
		int[] win_nums2 = {38, 19, 20, 40, 15, 25};
		int[] lottos3 = {45, 4, 35, 20, 3, 9};
		int[] win_nums3 = {20, 9, 3, 45, 4, 35};
		
		int[] result = s.solution(lottos1, win_nums1);
		System.out.println(Arrays.toString(result));
		result = s.solution(lottos2, win_nums2);
		System.out.println(Arrays.toString(result));
		result = s.solution(lottos3, win_nums3);
		System.out.println(Arrays.toString(result));
	}
}
