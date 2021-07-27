package _00_codingTest.programmers.level2.solution02;

import java.util.ArrayList;
import java.util.Collections;

public class Solution1 {

    public String solution(int n) {

        String[] nation = {"4", "1", "2"};

        ArrayList<Integer> list = new ArrayList();

        if (n > 0) {
            int temp = n;
            while (temp / 3 > 0) {
                if (temp % 3 == 0) {
                    list.add(temp % 3);
                    temp--;
                } else {
                    list.add(temp % 3);
                }
                temp /= 3;
            }
            if (temp != 0) {
                list.add(temp);
            }
        }

        Collections.reverse(list);

        ArrayList<String> strArr = new ArrayList<>();
        for (int i : list) {
            if (i == 0) strArr.add(nation[i]);
            else if (i == 1) strArr.add(nation[i]);
            else if (i == 2) strArr.add(nation[i]);
        }

        return strArr.stream().reduce((s1, s2) -> s1 + s2).get();
    }

    public static void main(String[] args) {
        int n = 4;
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(n));
    }

    /**
     * 3진법과 124나라의 공통점 :
     * 3진법 -> 1, 2, 0
     * 124나라 -> 1, 2, 4
     *
     * 차이점 :
     * 3진법은 3을 표현하기 위해서 0을 사용, 124나라는 4를 사용함.
     * 그러나 3진법에서 3을 표현할 시 0 혼자 등장하지 못함.
     * 앞에 1이 들어가서 10 <- 으로 표기가 되야 함.
     *
     * 즉, 1, 2, 3을 {1, 2, 4}로 표현하기 전에 3진법으로 풀면 1, 2, 10 이다.
     * 3은 10으로 두자리가 된다. 하지만 124나라 기법으로 하면 두자리가 아니고 3은 4가 된다.
     * 이점을 유의하고 풀이한다.
     *
     * 풀이 :
     * - 숫자 n이 3보다 크고 3으로 계속 나누어 지는지 체크한다.
     *  이 이유는 3진법으로 변환하기 위해서다.
     * - 숫자 n을 3으로 나눈 나머지가 0인지 본다. -> 3, 9, 25 등 3의  n제곱들인지 체크하기 위해서다.
     * - 이 숫자들을 3진법으로 표현하면
     *
     *  10진법 | 124나라 | 3진법
     *  3     | 4       | 10
     *  9     | 24      | 100
     *  27    | 224     | 1000
     *
     * [n이 3으로 나우어 떨어질 때]
     * - n이 3으로 나누어 떨어진다면, (3진법에서는 0 <-, 124나라에서는 4<- )를 리스트에 저장.
     * - n이 3으로 나누어 떨어진다면, n = n-1 (n이 3이라면 -> n = 2)
     * - n을 3으로 나눈 몫으로 다시 저장 => while문 반복
     *
     * [n이 3으로 나누어 떨어지지 않을 때]
     * - n % 3 나머지를 리스트에 저장
     * - n을 3으로 나눈 몫으로 다시 저장 => while문 반복
     *
     * [최종 몫이 0이 아니면 몫을 리스트에 저장]
     * 리스트에 저장 된 것을 거꾸로 꺼내어 [4, 1, 2] 순서에 맞춰서 answer에 재저장 후 리턴
     */
}
