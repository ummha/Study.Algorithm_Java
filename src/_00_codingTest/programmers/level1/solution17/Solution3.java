package _00_codingTest.programmers.level1.solution17;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Solution3 {

    /**
     * TreeSet을 활용한 솔루션 (TreeSet은 기본적으로 정렬이 되어져 add 되기 때문에 이 문제 풀이의 성능이 다른 솔루션보다 좋음)
     * @param numbers
     * @return
     */
    public int[] solution(int[] numbers) {
        Set<Integer> sumNumber = new TreeSet();

        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                sumNumber.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[sumNumber.size()];
        int index = 0;
        Iterator itr = sumNumber.iterator();
        while(itr.hasNext()){
            answer[index] = (int)itr.next();
            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        int[] numbers1 = {2,1,3,4,1};
        System.out.println(Arrays.toString(s.solution(numbers1)));
        int[] numbers2 = {5,0,2,7};
        System.out.println(Arrays.toString(s.solution(numbers2)));;
    }
}
