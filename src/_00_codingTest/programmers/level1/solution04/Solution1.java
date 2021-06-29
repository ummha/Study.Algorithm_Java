package _00_codingTest.programmers.level1.solution04;

import java.util.HashSet;

public class Solution1 {
	/**
	 * HashSet을 활용한 솔루션
	 * @param nums
	 * @return
	 */
	public int solution(int[] nums) {
		HashSet<Integer> hs = new HashSet<Integer>();
		int pickNum = nums.length / 2;

		for(int i=0; i<nums.length; i++) {
			hs.add(nums[i]);
		}

		return hs.size() >= pickNum ? pickNum : hs.size();
	}

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int[] nums1 = {3,1,2,3};
		int result = s.solution(nums1);
		System.out.println(result);
		int[] nums2 = {3,3,3,2,2,4};
		result = s.solution(nums2);
		System.out.println(result);
		int[] nums3 = {3,3,3,2,2,2};
		result = s.solution(nums3);
		System.out.println(result);
	}
}
