package _01_basic.sort._07_merge;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
	static final String ASC = "ASC";
	static final String DESC = "DESC";

	/**
	 * 병합정렬<br>
	 * 배열(리스트)의 길이가 1이 될 때 까지 분할한 후 분할된 원소들을 정렬하면서 병합(합병)한다.
	 * @param arr
	 * @param left
	 * @param right
	 * @param way
	 */
	public static void mergeSort(int[] arr, int left, int right, String way) {
		// 원소의 수가 2개 이상일경우 실행
		if(left < right) {
			// 반으로 나누기 위한 변수
			int mid = (left + right) / 2;

			// 앞(왼쪽)부분 재귀 호출
			mergeSort(arr, left, mid, way); 

			// 뒤(오른쪽)부분 재귀 호출
			mergeSort(arr, mid + 1, right, way);

			// 원소를 Merge하는 함수
			if(way.equals(ASC)) mergeAsc(arr, left, mid, right);
			if(way.equals(DESC)) mergeDesc(arr, left, mid, right);
		}
	}

	/**
	 * 오름차순 병합
	 * @param arr
	 * @param left
	 * @param mid
	 * @param right
	 */
	private static void mergeAsc(int[] arr, int left, int mid, int right) {
		int i = left;
		int k = mid + 1;
		int tempIndex = left;

		int[] temp = new int[arr.length];

		while (i <= mid && k <= right) {
			if (arr[i] < arr[k]) {
				temp[tempIndex++] = arr[i++];
			} else {
				temp[tempIndex++] = arr[k++];
			}
		}

		// 앞(왼쪽)부분 배열에 원소가 남아있는 경우
		while (i <= mid) { 
			temp[tempIndex++] = arr[i++];
		}

		// 뒤(오른쪽)부분 배열에 원소가 남아있는 경우
		while (k <= right) {
			temp[tempIndex++] = arr[k++];
		}

		for (int idx = left; idx < tempIndex; idx++) {
			arr[idx] = temp[idx];
		}
	}

	/**
	 * 내림차순 병합
	 * @param arr
	 * @param left
	 * @param mid
	 * @param right
	 */
	private static void mergeDesc(int[] arr, int left, int mid, int right) {
		int i = left;
		int k = mid + 1;
		int tempIndex = left;

		int[] temp = new int[arr.length];

		while (i <= mid && k <= right) {
			if (arr[i] > arr[k]) {
				temp[tempIndex++] = arr[i++];
			} else {
				temp[tempIndex++] = arr[k++];
			}
		}

		// 앞(왼쪽)부분 배열에 원소가 남아있는 경우
		while (i <= mid) { 
			temp[tempIndex++] = arr[i++];
		}

		// 뒤(오른쪽)부분 배열에 원소가 남아있는 경우
		while (k <= right) {
			temp[tempIndex++] = arr[k++];
		}

		for (int idx = left; idx < tempIndex; idx++) {
			arr[idx] = temp[idx];
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

		mergeSort(arrList, 0, arrList.length-1, ASC);

		System.out.println("ASC : " + Arrays.toString(arrList));

		mergeSort(arrList, 0, arrList.length-1, DESC);

		System.out.println("DESC : " + Arrays.toString(arrList));
	}
}
