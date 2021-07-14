package _00_codingTest.programmers.level1.solution26;

import java.util.Arrays;

public class Solution3 {
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings).map(string -> new IndexString(string, n)).sorted()
                .map(indexString -> indexString.string).toArray(String[]::new);
    }

    class IndexString implements Comparable<IndexString> {

        String string;
        char index;

        IndexString(String string, int index) {
            this.string = string;
            this.index = string.charAt(index);
        }

        public int compareTo(IndexString indexString) {
            System.out.println(index+"," + indexString.index);
            if (index == indexString.index) {
                return string.compareTo(indexString.string);
            } else {
                return index - indexString.index;
            }
        }
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        String[] strings = {"abce", "abcd", "cdx"};
        System.out.println(Arrays.toString(solution3.solution(strings, 1)));
    }
}
