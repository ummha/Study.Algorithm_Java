package _00_codingTest.programmers.level1.solution04;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	/**
	 * List을 활용한 솔루션
	 * @param nums
	 * @return
	 */
	public int solution(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }

        return nums.length/2 > list.size()?list.size():nums.length/2;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
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
