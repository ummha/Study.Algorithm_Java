package _00_codingTest.programmers.level2.solution03;

public class Solution2 {
    static String[] arr = {"A","C","F","J","M","N","R","T"};
    static String[] result = new String[8];
    static boolean[] used = new boolean[8];
    static int answer;
    public int solution(int n, String[] data) {
        answer = 0;
        perm(0,data);
        return answer;
    }
    static void perm(int cnt, String[] data){
        if(cnt==8){
            String s = "";
            for(int i=0; i<arr.length; i++){
                s+=result[i];
            }
            for(int i=0; i<data.length; i++){
                int start = s.indexOf(data[i].charAt(0));
                int end = s.indexOf(data[i].charAt(2));

                if(data[i].charAt(3)=='=' && Math.abs(start-end)-1!=data[i].charAt(4)-'0'){
                    return;
                }else if(data[i].charAt(3)=='<' && Math.abs(start-end)-1>=data[i].charAt(4)-'0'){
                    return;
                }else if(data[i].charAt(3)=='>' && Math.abs(start-end)-1<=data[i].charAt(4)-'0'){
                    return;
                }
            }
            answer++;
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(!used[i]){
                used[i] = true;
                result[cnt] = arr[i];
                perm(cnt+1, data);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        String[] data1 = {"N~F=0", "R~T>2"};
        String[] data2 = {"M~C<2", "C~M>1"};
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution(2, data1));
        System.out.println(solution2.solution(2, data2));
    }
}
