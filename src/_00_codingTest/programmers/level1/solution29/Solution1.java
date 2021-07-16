package _00_codingTest.programmers.level1.solution29;

public class Solution1 {

    /**
     * matches() 함수와 정규식을 활용한 솔루션
     * @param s
     * @return
     */
    public boolean solution1(String s) {
        if (s.length() != 4 && s.length() != 6) return false;
        return s.matches("^[0-9]+$");
    }

    /**
     * NumberFormatException 예외처리를 활용한 솔루션
     * @param s
     * @return
     */
    public boolean solution2(String s) {
        if (s.length() != 4 && s.length() != 6) return false;

        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    /**
     * Character 클래스를 활용한 솔루션
     * @param s
     * @return
     */
    public boolean solution3(String s) {
        if (s.length() != 4 && s.length() != 6) return false;

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    /**
     * [java8이상] allMatch() 메소드와 Character 클래스의 isDigit()을 활용한 솔루션
     * @param s
     * @return
     */
    public boolean solution4(String s) {
        if (s.length() != 4 && s.length() != 6) return false;
        return s.chars().allMatch( Character::isDigit );
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution1("a123"));
        System.out.println(solution1.solution2("1234"));
        System.out.println(solution1.solution3("a123"));
        System.out.println(solution1.solution4("1233"));
    }
}
