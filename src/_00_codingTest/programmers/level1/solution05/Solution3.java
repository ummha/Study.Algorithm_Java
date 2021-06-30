package _00_codingTest.programmers.level1.solution05;

public class Solution3 {
    public String solution(String new_id) {
        String answer = "";
        String temp = new_id.toLowerCase();

        temp = temp.replaceAll("[^-_.a-z0-9]","");

        temp = temp.replaceAll("[.]{2,}",".");
        temp = temp.replaceAll("^[.]|[.]$","");

        if(temp.equals(""))
            temp+="a";
        if(temp.length() >=16){
            temp = temp.substring(0,15);
            temp=temp.replaceAll("^[.]|[.]$","");
        }
        if(temp.length()<=2)
            while(temp.length()<3)
                temp+=temp.charAt(temp.length()-1);

        answer=temp;
        return answer;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        String result1 = s.solution("...!@BaT#*..y.abcdefghijklm");
        System.out.println(result1);
        String result2 = s.solution("z-+.^.");
        System.out.println(result2);
        String result3 = s.solution("=.=");
        System.out.println(result3);
        String result4 = s.solution("123_.def");
        System.out.println(result4);
        String result5 = s.solution("abcdefghijklmn.p");
        System.out.println(result5);
    }
}
