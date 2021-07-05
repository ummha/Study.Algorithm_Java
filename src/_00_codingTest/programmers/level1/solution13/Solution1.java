package _00_codingTest.programmers.level1.solution13;

import java.util.Arrays;

public class Solution1 {

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        float[][] fRate = new float[N][2];

        int stagePosi = 0;
        for(int i=1; i<=N; i++){
            int notPassCnt = 0;
            int passCnt = 0;
            for(int j=0; j<stages.length; j++){
                if(stages[j] >= i){
                    if(stages[j]==i) notPassCnt++;
                    passCnt++;
                }
            }
            fRate[i-1][0] = (float)notPassCnt / passCnt;
            fRate[i-1][1] = i;
        }

        sort(fRate);

        for(int i=0; i<fRate.length; i++){
            answer[i] = (int)fRate[i][1];
        }

        return answer;
    }

    private void sort(float[][] fRate){
        for(int i=0; i<fRate.length; i++){
            for(int j=0; j<fRate.length-i-1; j++){
                if(fRate[j][0] < fRate[j+1][0]){
                    float[] temp = fRate[j];
                    fRate[j] = fRate[j+1];
                    fRate[j+1] = temp;
                }else if(fRate[j][0] == fRate[j+1][0] && fRate[j][1] > fRate[j+1][1]){
                    float temp = fRate[j][1];
                    fRate[j][1] = fRate[j+1][1];
                    fRate[j+1][1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] stages1 = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] result = solution1.solution(5, stages1);
        System.out.println(Arrays.toString(result));
        int[] stages2 = {4,4,4,4,4};
        result = solution1.solution(4, stages2);
        System.out.println(Arrays.toString(result));
    }
}
