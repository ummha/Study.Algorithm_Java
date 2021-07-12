package _00_codingTest.programmers.level1.solution21;

public class Solution1 {
    final String[][] words3 = {
            {"1", "one"},
            {"2", "two"},
            {"6", "six"}
    };
    final String[][] words4 = {
            {"0", "zero"},
            {"4", "four"},
            {"5", "five"},
            {"9", "nine"}
    };
    final String[][] words5 = {
            {"3", "three"},
            {"7", "seven"},
            {"8", "eight"}
    };

    public int solution(String s) {
        StringBuffer answer = new StringBuffer();
        StringBuffer temp = new StringBuffer();
        for(int i=0; i<s.length(); i++){
            String chkStr = s.substring(i, i+1);
            if(java.util.regex.Pattern.matches("^[0-9]*$", chkStr)){
                if(temp.length() != 0){
                    answer.append(convertWords(temp.toString()));
                    temp.setLength(0);
                }
                answer.append(chkStr);
            }else{
                temp.append(chkStr);
                String str = convertWords(temp.toString());
                if(!str.equals("")) {
                    answer.append(str);
                    temp.setLength(0);
                }
            }
        }

        return Integer.parseInt(answer.toString());
    }

    private String convertWords(String w){
        String result = "";
        switch (w.length()){
            case 3:
                for(int i=0; i<words3.length; i++) if(words3[i][1].equals(w)) return words3[i][0];
                return result;
            case 4:
                for(int i=0; i<words4.length; i++) if(words4[i][1].equals(w)) return words4[i][0];
                return result;
            case 5:
                for(int i=0; i<words5.length; i++) if(words5[i][1].equals(w)) return words5[i][0];
                return result;
            default:
                return result;
        }
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution("23four5six7"));
    }
}
