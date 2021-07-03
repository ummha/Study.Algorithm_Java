package _00_codingTest.programmers.level1.solution10;

import java.util.HashSet;

public class Solution2 {

    /**
     * HashSet을 활용한 솔루션
     * @param n
     * @param lost
     * @param reserve
     * @return
     */
    public int solution(int n, int[] lost, int[] reserve) {
        int answer=n-lost.length;
        HashSet<Integer> ko = new HashSet<Integer>();
        for(int k : reserve) {
            ko.add(k);
        }
        for(int i =0;i<lost.length;i++) {
            if(ko.contains(lost[i])) {
                //System.out.println("내껀내가입지");
                answer++;
                ko.remove(lost[i]);
                lost[i]=-1;
            }
        }

        for(int i =0;i<lost.length;i++) {
            //System.out.println(i);

            if(ko.contains(lost[i]-1)) {
                //System.out.println("있다");
                answer++;
                ko.remove(lost[i]-1);
            }else if(ko.contains(lost[i]+1)) {
                //System.out.println("있다");
                answer++;
                ko.remove(lost[i]+1);
            }
            //System.out.println("없다");
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] lost = {3, 4};
        int[] reserve = {1, 3, 5};
        System.out.println(solution2.solution(5, lost, reserve));

    }
}
