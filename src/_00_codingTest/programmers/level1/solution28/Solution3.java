package _00_codingTest.programmers.level1.solution28;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution3 {

    public String solution(String str){
        return Stream.of(str.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.solution("Zbcdefg"));
    }
}
