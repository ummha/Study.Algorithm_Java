package _01_basic.sort._03_insertion;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
	
	/**
	 * 삽입 정렬 오름차순
	 * @param arr
	 */
	public static void insertionSortAscending(int[] arr) {
		int temp = 0;
		int k = 0; //저장될 인덱스
		for(int i = 1; i < arr.length; i++) {
			temp = arr[i];
			
			for(k = i-1; k>=0 && temp<arr[k]; k--) {
				arr[k+1] = arr[k];
			}
			arr[k+1] = temp;
		}
	}
	
	/**
	 * 삽입 정렬 내림차순
	 * @param arr
	 */
	public static void insertionSortDescending(int[] arr) {
		int temp = 0;
		int k = 0; //저장될 인덱스
		for(int i = 1; i < arr.length; i++) {
			temp = arr[i];
			
			for(k = i-1; k>=0 && temp>arr[k]; k--) {
				arr[k+1] = arr[k];
			}
			arr[k+1] = temp;
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

		insertionSortAscending(arrList);

		System.out.println("ASC : " + Arrays.toString(arrList));

		insertionSortDescending(arrList);

		System.out.println("DESC : " + Arrays.toString(arrList));
	}
}
