package basic.sort._01_bubble;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
	
	public static void bubbleSortAscending(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void bubbleSortDescending(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Random generator = new Random(); // 랜덤한 값 추출 객체 생성
		int arrSize = 10;
		int[] arrList = new int[arrSize];
		for(int i = 0; i < arrSize; i++) {
			arrList[i] = generator.nextInt(201) - 100; // -100 ~ 100까지 범위에 있는 무작위 난수 추출
			// generator.nextInt() : 매개변수 선언이 없으면 가능한 모든 int 값(양수와 음수)에 걸친 범위의 난수를 반환
		}
		System.out.println("BEFORE : " + Arrays.toString(arrList));
		
		bubbleSortAscending(arrList);
		
		System.out.println("ASC : " + Arrays.toString(arrList));
		
		bubbleSortDescending(arrList);
		
		System.out.println("DESC : " + Arrays.toString(arrList));
	}
}
