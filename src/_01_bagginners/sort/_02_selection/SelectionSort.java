package _01_bagginners.sort._02_selection;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

	/**
	 * 선택 정렬 오름차순
	 * 
	 * @param arr
	 */
	public static void selectionSortAscending(int[] arr) {
		int min = 0;

		for (int i = 0; i < arr.length; i++) {
			min = i;

			for (int k = i + 1; k < arr.length; k++) {
				if (arr[min] > arr[k])
					min = k;

			}
			int tmp = arr[min];
			arr[min] = arr[i];
			arr[i] = tmp;

		}
	}

	/**
	 * 선택 정렬 내림차순
	 * 
	 * @param arr
	 */
	public static void selectionSortDescending(int[] arr) {
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			max = i;

			for (int k = i + 1; k < arr.length; k++) {
				if (arr[max] < arr[k])
					max = k;

			}
			int tmp = arr[max];
			arr[max] = arr[i];
			arr[i] = tmp;

		}
	}

	public static void main(String[] args) {
		Random generator = new Random();
		int arrSize = 10;
		int[] arrList = new int[arrSize];
		for (int i = 0; i < arrSize; i++) {
			arrList[i] = generator.nextInt(201) - 100;
		}

		System.out.println("BEFORE : " + Arrays.toString(arrList));

		selectionSortAscending(arrList);

		System.out.println("ASC : " + Arrays.toString(arrList));

		selectionSortDescending(arrList);

		System.out.println("DESC : " + Arrays.toString(arrList));
	}
}
