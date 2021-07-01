package _00_codingTest.programmers.level1.solution07;

public class Solution1 {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length -1; j++){
                for(int k=j+1; k<nums.length; k++){
                    //if(nums[i] == nums[j] || nums[i] == nums[k] || nums[k] == nums[j]) continue;
                    if(isPrime(nums[i] + nums[j] + nums[k])) {
                        System.out.println("i : " + nums[i] + ", j :" + nums[j] + ", k : " + nums[k] + ", sum : " + (nums[i] + nums[j] + nums[k]));
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    private boolean isPrime(int sum){
        if(sum < 2) return false; // 0, 1은 소수가 아님
        if(sum == 2) return true; // 2는 소수

        for(int i=2; i<sum; i++){
            //소수가 아닐경우
            if(sum % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {1,2,7,6,4};
        int result = s.solution(nums1);
        System.out.println(result);
        result = s.solution(nums2);
        System.out.println(result);
    }
}
