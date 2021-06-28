package _00_codingTest.programmers.level1.solution03;

import java.util.Arrays;
import java.util.stream.LongStream;

public class Solution2 {
	
	// 스트림 람다를 활용한 솔루션
    public int[] solution(int[] lottos, int[] winNums) {
        return LongStream.of(
                (lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(winNums).anyMatch(w -> w == l) || l == 0).count(),
                (lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(winNums).anyMatch(w -> w == l)).count()
        )
                .mapToInt(op -> (int) (op > 6 ? op - 1 : op))
                .toArray();
    }
    
	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int[] lottos1 = {44, 1, 0, 0, 31, 25};
		int[] win_nums1 = {31, 10, 45, 1, 6, 19};
		int[] lottos2 = {0, 0, 0, 0, 0, 0};
		int[] win_nums2 = {38, 19, 20, 40, 15, 25};
		int[] lottos3 = {45, 4, 35, 20, 3, 9};
		int[] win_nums3 = {20, 9, 3, 45, 4, 35};
		System.out.println("results :");
		int[] result = s.solution(lottos1, win_nums1);
		System.out.println(Arrays.toString(result));
		result = s.solution(lottos2, win_nums2);
		System.out.println(Arrays.toString(result));
		result = s.solution(lottos3, win_nums3);
		System.out.println(Arrays.toString(result));
	}
}
