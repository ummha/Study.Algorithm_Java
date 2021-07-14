package _00_codingTest.programmers.level1.solution26;

import java.util.Arrays;

public class Solution1 {
    public String[] solution(String[] strings, int n) {

        for(int i=0; i<strings.length; i++) {
            for(int j=0; j<strings.length-i-1; j++){
                int result = Character.toString(strings[j].charAt(n)).compareTo(Character.toString(strings[j+1].charAt(n)));
                if(result > 0){
                    String tmp = strings[j+1];
                    strings[j+1] = strings[j];
                    strings[j] = tmp;
                }else if(result == 0){
                    if(strings[j].compareTo(strings[j+1]) > 0){
                        String tmp = strings[j+1];
                        strings[j+1] = strings[j];
                        strings[j] = tmp;
                    }
                }
            }
        }

        return strings;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        String[] strings = {"abce", "abcd", "cdx"};
        System.out.println(Arrays.toString(solution1.solution(strings, 1)));
    }
}
