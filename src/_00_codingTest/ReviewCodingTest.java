package _00_codingTest;

import java.util.Locale;

public class ReviewCodingTest {

	public int solution(int[] nums){
		int answer = 0;
		for(int i=0; i<nums.length-2; i++){
			for(int j=i+1; j<nums.length-1; j++){
				for(int k=j+1; k< nums.length; k++){
					if(isPrime(nums[i]+nums[j]+nums[k]))
						answer++;
				}
			}
		}
		return answer;
	}

	private boolean isPrime(int sum){
		if(sum < 2) return false;
		if(sum == 2) return true;
		for(int i=2; i<sum; i++){
			if(sum % i == 0) return false;
		}
		return true;
	};

	public static void main(String[] args) {
		ReviewCodingTest c = new ReviewCodingTest();
		int[] nums1 = {1,2,3,4};
		int[] nums2 = {1,2,7,6,4};
		int result = c.solution(nums1);
		System.out.println(result);
		result = c.solution(nums2);
		System.out.println(result);
	}
}
