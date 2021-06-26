package _01_basic.sort._04_shell;

import java.util.Arrays;
import java.util.Random;

public class ShellSort {
	static final String ASC = "ASC";
	static final String DESC = "DESC";
	
	/**
	 * 간격별 삽입정렬 오름차순
	 * @param arr
	 * @param begin
	 * @param end
	 * @param interval
	 */
	public static void intervalSortAsc(int[] arr, int begin, int end, int interval) {
		int k;
		for(int i = begin+interval; i <= end; i = i+interval) {
			int temp = arr[i];
			
			for(k = i-interval; k >= begin && temp < arr[k]; k = k-interval) {
				arr[k+interval] = arr[k];
			}
			arr[k+interval] = temp;
		}
	}
	
	/**
	 * 간격별 삽입정렬 내림차순
	 * @param arr
	 * @param begin
	 * @param end
	 * @param interval
	 */
	public static void intervalSortDesc(int[] arr, int begin, int end, int interval) {
		int k;
		for(int i = begin+interval; i <= end; i = i+interval) {
			int temp = arr[i];
			
			for(k = i-interval; k >= begin && temp > arr[k]; k = k-interval) {
				arr[k+interval] = arr[k];
			}
			arr[k+interval] = temp;
		}
	}
	
	/**
	 * 셸 정렬
	 * @param arr
	 * @param sort
	 */
	public static void shellSort(int[] arr, String sort) {
		int size = arr.length;
		int interval = size / 2;	// 간격
		if((interval%2) == 0) interval++;
		while(interval >= 1) {
			for(int i = 0; i < interval; i++) {
				if(sort.equals(ASC)) {
					intervalSortAsc(arr, i, size-1, interval);
				} else if(sort.equals(DESC)) {
					intervalSortDesc(arr, i, size-1, interval);
				}
			}
			
			//System.out.println("간격 : "+interval);
			//System.out.println("> 결과 : "+Arrays.toString(arr));
			
			interval = interval / 2;
			if((interval%2) == 0 && interval > 1) interval++;
		}
	}
	
	public static void main(String[] args) {
		Random generator = new Random();
		int arrSize = 10;
		int[] arrList = new int[arrSize];
		for(int i = 0; i < arrSize; i++) {
			arrList[i] = generator.nextInt(201) - 100; 
		}
		System.out.println("BEFORE : " + Arrays.toString(arrList));

		shellSort(arrList, ASC);

		System.out.println("ASC : " + Arrays.toString(arrList));

		shellSort(arrList, DESC);

		System.out.println("DESC : " + Arrays.toString(arrList));
	}
}
