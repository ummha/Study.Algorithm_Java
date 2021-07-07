package _00_codingTest.programmers.level1.solution17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    /**
     * HashSet과 깔끔한 스트림 정렬을 활용한 솔루션 (많이 느림)
     * @param numbers
     * @return
     */
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] numbers1 = {2,1,3,4,1};
        System.out.println(Arrays.toString(s.solution(numbers1)));
        int[] numbers2 = {5,0,2,7};
        System.out.println(Arrays.toString(s.solution(numbers2)));;
    }
}
