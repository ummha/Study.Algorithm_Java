package _00_codingTest.programmers.level1.solution19;

public class Solution1 {

    /**
     * 가독성을 위한 솔루션
     * @param s
     * @return
     */
    public String solution(String s) {
        String answer = "";

        int middle = s.length()/2;
        if(s.length() % 2 == 0){
            answer = s.substring(middle-1, middle+1);
        }else{
            answer = s.substring(middle, middle+1);
        }
        return answer;
    }

    /**
     * 한 줄 코드로 끝내는 솔루션
     * @param word
     * @return
     */
    public String getMiddle(String word){
        return word.substring((word.length()-1) / 2, word.length()/2 + 1);
    }
    
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "qwer";
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(s1));
        System.out.println(solution1.getMiddle(s2));
    }
}
