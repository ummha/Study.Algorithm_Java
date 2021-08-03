package _01_bagginners.sort._05_quick;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	static final String ASC = "ASC";
	static final String DESC = "DESC";
	
	/**
	 * 중간 값(mid)을 기준으로 분할 및 정렬하고 분할 및 정렬된 좌, 우를 한 번 더 수행 
	 * @param arr
	 * @param low
	 * @param high
	 * @param way
	 */
	private static void sort(int[] arr, int low, int high, String way) {
		if(low >= high) return;
		
		int mid = 0;
		
		if(way.equals(ASC)) {
			mid = partitionAsc(arr, low, high);
		}else if(way.equals(DESC)) {
			mid = partitionDesc(arr, low, high);
		}
		
		sort(arr, low, mid - 1, way);
		sort(arr, mid, high, way);
	}
	
	/**
	 * 임의의 값 피벗(pivot)을 기준으로 분할 및 오름차순 정렬
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	private static int partitionAsc(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low] < pivot) low++;
            while (arr[high] > pivot) high--;
            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }
        return low;
	}
	
	/**
	 * 임의의 값 피벗(pivot)을 기준으로 분할 및 내림차순 정렬
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	private static int partitionDesc(int[] arr, int low, int high) {
		int pivot = arr[(low + high) / 2];
		while (low <= high) {
			while (arr[low] > pivot) low++;
			while (arr[high] < pivot) high--;
			if (low <= high) {
				swap(arr, low, high);
				low++;
				high--;
			}
		}
		return low;
	}
	
	/**
	 * 교환
	 * @param arr
	 * @param i
	 * @param j
	 */
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    
    /**
     * 퀵 정렬 수행
     * @param arr
     * @param way
     */
	public static void quickSort(int[] arr, String way) {
		sort(arr, 0, arr.length -1, way);
	};
	
	public static void main(String[] args) {
		Random generator = new Random();
		int arrSize = 10;
		int[] arrList = new int[arrSize];
		for(int i = 0; i < arrSize; i++) {
			arrList[i] = generator.nextInt(201) - 100; 
		}
		System.out.println("BEFORE : " + Arrays.toString(arrList));

		quickSort(arrList, ASC);

		System.out.println("ASC : " + Arrays.toString(arrList));

		quickSort(arrList, DESC);

		System.out.println("DESC : " + Arrays.toString(arrList));
	}
}