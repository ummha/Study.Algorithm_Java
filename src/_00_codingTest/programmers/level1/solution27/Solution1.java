package _00_codingTest.programmers.level1.solution27;

public class Solution1 {

    boolean solution(String s) {
        int cntP = 0;
        int cntY = 0;

        s = s.toLowerCase();
        char[] chrArr = s.toCharArray();

        for(int i=0; i<chrArr.length; i++){
            if(chrArr[i] == 'p') cntP++;
            if(chrArr[i] == 'y') cntY++;
        }

        if(cntP == cntY) return true;
        else if(cntP==0 && cntY==0) return true;

        return false;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution("pPoooyY"));
    }
}
