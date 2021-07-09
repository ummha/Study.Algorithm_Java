package _00_codingTest.programmers.level1.solution18;

public class Solution2 {

    /**
     * switch문을 활용한 솔루션
     * @param a
     * @param b
     * @return
     */
    public String solution(int a, int b){
        String answer = "";
        int[] monthDay={31,29,31,30,31,30,31,31,30,31,30,31};
        for (int i = 1; i < a; i++) {
            b+=monthDay[i-1];
        }
        switch(b%7){
            case 3:answer="SUN";break;
            case 4:answer="MON";break;
            case 5:answer="TUE";break;
            case 6:answer="WED";break;
            case 0:answer="THU";break;
            case 1:answer="FRI";break;
            case 2:answer="SAT";break;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution(5, 24));
    }
}
