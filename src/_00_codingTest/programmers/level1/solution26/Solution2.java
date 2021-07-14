package _00_codingTest.programmers.level1.solution26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution2 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        String[] strings = {"abce", "abcd", "cdx"};
        System.out.println(Arrays.toString(solution2.solution(strings, 1)));
    }
}
