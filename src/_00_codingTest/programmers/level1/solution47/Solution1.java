package _00_codingTest.programmers.level1.solution47;

public class Solution1 {

    public String solution1(String phone_number) {
        String stars = "";
        for (int i = 0; i < phone_number.length() - 4; i++) stars += "*";

        return stars + phone_number.substring(phone_number.length() - 4, phone_number.length());
    }

    public String solution2(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }

    public String solution3(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }

    public static void main(String[] args) {
        String phone_number = "01033334444";
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution1(phone_number));
        System.out.println(solution1.solution2(phone_number));
        System.out.println(solution1.solution3(phone_number));
    }
}
