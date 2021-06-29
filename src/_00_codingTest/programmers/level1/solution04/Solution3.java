package _00_codingTest.programmers.level1.solution04;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution3 {
	/**
	 * 현대적 문법(람다, 스트림)을 활용한 솔루션
	 * @param nums
	 * @return
	 */
	public int solution(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
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
