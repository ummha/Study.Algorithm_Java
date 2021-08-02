package _00_codingTest.programmers.level2.solution06;

import java.util.PriorityQueue;

public class Solution1 {

    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int sc : scoville) pq.offer(sc);

        if (pq.peek() >= K) return -1;

        while (pq.peek() <= K) {
            if (pq.size() == 1) return -1;

            int a = pq.poll();
            int b = pq.poll();

            int result = a + (b * 2);
            pq.offer(result);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] scoville = {10, 5, 2, 4, 5};
        Solution1 solution1 = new Solution1();
        solution1.solution(scoville, 10);
    }

    /**
     * 우선순위 큐(Priority Queue)란?
     * PriorityQueue는 먼저 들어온 순서대로 데이터가 나가는 것이 아닌 우선순위를 먼저 결정하고 그 우선순위가 높은 엘리먼트가 먼저 나가는 자료구조
     *
     * Priority Queue의 특징
     * 1. 높은 우선순위의 요소를 먼저 꺼내서 처리하는 구조 (큐에 들어가는 원소는 비교가 가능한 기준이 있어야함)
     * 2. 내부 요소는 힙으로 구성되어 이진트리 구조로 이루어져 있음
     * 3. 내부구조가 힙으로 구성되어 있기에 시간 복잡도는 O(NLogN)
     * 4. 응급실과 같이 우선순위를 중요시해야 하는 상황에서 쓰임
     */
}
