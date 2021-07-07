package _00_codingTest.programmers.level1.solution16;

public class Solution1 {

    /**
     * 셸 정렬을 활용한 솔루션
     * Arrays.sort()로 대체 가능 (성능: 셸 정렬 > Arrays.sort())
     * @param d
     * @param budget
     * @return
     */
    public int solution(int[] d, int budget) {
        int answer = 0;

        shellSort(d);

        for(int i=0; i<d.length; i++){
            if(budget-d[i] >= 0){
                answer++;
                budget-=d[i];
            }else{
                break;
            }
        }
        return answer;
    }
    private void intervalSortAsc(int[] arr, int begin, int end, int interval) {
        int k;
        for(int i = begin+interval; i <= end; i = i+interval) {
            int temp = arr[i];

            for(k = i-interval; k >= begin && temp < arr[k]; k = k-interval) {
                arr[k+interval] = arr[k];
            }
            arr[k+interval] = temp;
        }
    }
    private void shellSort(int[] arr) {
        int size = arr.length;
        int interval = size / 2;	// 간격
        if((interval%2) == 0) interval++;
        while(interval >= 1) {
            for(int i = 0; i < interval; i++) {
                intervalSortAsc(arr, i, size-1, interval);
            }
            interval = interval / 2;
            if((interval%2) == 0 && interval > 1) interval++;
        }
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] d = {1, 2, 3, 4, 5, 100, 101};
        int budget = 106;
        System.out.println(solution1.solution(d, budget));
    }
}
