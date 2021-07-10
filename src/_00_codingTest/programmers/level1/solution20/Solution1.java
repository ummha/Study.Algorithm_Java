package _00_codingTest.programmers.level1.solution20;

import java.util.Arrays;

public class Solution1 {

    /**
     * 나의 풀이 (2진법 변환->2진법 for문 돌려서 1 체크)
     * @param n
     * @param arr1
     * @param arr2
     * @return
     */
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] map = new String[n];

        for(int i=0; i<map.length; i++){
            map[i] = "";
            char[] ch1 = conversion(arr1[i], 2, n).toCharArray();
            char[] ch2 = conversion(arr2[i], 2, n).toCharArray();
            for(int j=0; j<ch1.length; j++){
                map[i] += Character.toString(ch1[j]).equals("1") || Character.toString(ch2[j]).equals("1") ? "#" : " ";
            }
        }

        return map;
    }

    private String conversion(int number, int N, int size){
        StringBuilder sb = new StringBuilder();
        int current = number;
        while(current > 0){
            if(current % N < 10){
                sb.append(current % N);
            } else {
                sb.append((char)(current % N - 10 + 'A'));
            }
            current /= N;
        }

        int len = size-sb.length();
        if(len != 0){
            for(int i=0; i<len; i++) {
                sb.append(0);
            }
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        Solution1 solution1 = new Solution1();
        System.out.println(Arrays.toString(solution1.solution(5, arr1, arr2)));
    }
}
