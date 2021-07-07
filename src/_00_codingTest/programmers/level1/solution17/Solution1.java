package _00_codingTest.programmers.level1.solution17;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution1 {
    /**
     * ArrayList를 활용한 솔루션 (좀 느림)
     * @param numbers
     * @return
     */
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(i != j && !list.contains(numbers[i] + numbers[j])) list.add(numbers[i] + numbers[j]);
            }
        }

        list.sort((a,b)->a.compareTo(b));

        int[] answer = new int[list.size()];
        int i=0;
        for(Integer item : list){
            answer[i++] = item;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] numbers1 = {2,1,3,4,1};
        System.out.println(Arrays.toString(s.solution(numbers1)));
        int[] numbers2 = {5,0,2,7};
        System.out.println(Arrays.toString(s.solution(numbers2)));;
    }
}
