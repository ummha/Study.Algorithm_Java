package _00_codingTest.programmers.level1.solution05;

import java.util.Locale;

public class Solution1 {

    public String solution(String new_id) {
        String answer = "";

        answer = removeSpecialChar(new_id);
        if(answer.length() == 0) answer = "a"; //5단계
        if(answer.length() >= 16) answer = removeComma(answer.substring(0, 15)); //6단계
        if(answer.length() <= 2) {
            answer = makeMinLength(answer, answer.substring(answer.length()-1, answer.length()));
        }

        return answer;
    }

    private String removeSpecialChar(String new_id){
        return removeComma(new_id.toLowerCase()   //1단계
                .replaceAll("[^a-z\\d\\-_.]*", "")  //2단계
                .replaceAll("\\.{2,}", ".") //3단계
        );
    }
    
    //4단계
    private String removeComma(String new_id){
        if(new_id.length() == 0) return new_id;
        String id = new_id.lastIndexOf(".") == new_id.length()-1 ? new_id.substring(0, new_id.length()-1) : new_id;
        return id.indexOf(".") == 0 ? id.substring(1, id.length()) : id;
    }
    
    // 7단계
    private String makeMinLength(String target, String addStr){
        target += addStr;
        return target.length() < 3 ? makeMinLength(target, addStr) : target;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        String result;
        result = s.solution("...!@BaT#*..y.abcdefghijklm");
        System.out.println(result);
        result = s.solution("z-+.^.");
        System.out.println(result);
        result = s.solution("=.=");
        System.out.println(result);
        result = s.solution("123_.def");
        System.out.println(result);
        result = s.solution("abcdefghijklmn.p");
        System.out.println(result);
    }
}
