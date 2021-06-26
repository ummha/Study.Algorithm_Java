package _01_basic.sort._08_radix;

import java.util.Arrays;
import java.util.Random;

public class RadixSort {

	/**
	 * 배열에서 최대값 추출 (절대값 기준)
	 * @param arr
	 * @return
	 */
	public static int getMax(int[] arr) {
		int max = Math.abs(arr[0]);
		for(int i=1; i<arr.length; i++) {
			if(Math.abs(arr[i]) > max) max = Math.abs(arr[i]);
		}
		return max;
	}

	/**
	 * exp 변수의 수에 따라 숫자를 오름차순 정렬
	 * @param arr
	 * @param exp
	 */
	private static void countSort(int[] arr, int exp) {
		int[] output = new int[arr.length];
		int[] count = new int[10];
		Arrays.fill(count, 0); // count 배열의 각 인덱스에 0값을 채운다

		// count 값 count배열에 저장
		for(int i=0; i<arr.length; i++) {
			count[Math.abs((arr[i]/exp)%10)]++;
		}

		// count 값이 포함시켜 count배열에 저장
		for(int i=1; i<10; i++) {
			count[i] += count[i-1];
		}

		// output배열 빌드
		for(int i=arr.length-1; i>=0; i--) { 
			output[count[Math.abs((arr[i]/exp)%10)]-1] = arr[i]; 
			count[Math.abs((arr[i]/exp)%10)]--; 
		}

		// output 배열에 저장된 값을 data 배열에 저장
		for(int i=0; i<arr.length; i++) { 
			arr[i] = output[i]; 
		}
	}

	/**
	 * 기수 정렬<br>
	 * 유의할 점 : 음수와 양수를 분리해서 생각해야 한다.
	 * @param arr
	 * @param way
	 */
	public static void radixSort(int[] arr) {
		// 양수 / 음수 배열 분리
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0) cnt++;
		}
		int[] pArr = new int[cnt];
		int[] nArr = new int[arr.length-cnt];
		int pCnt = 0;
		int nCnt = 0;
		// 양수, 음수 배열 빌드
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				pArr[pCnt++] = arr[i];
			} else {
				nArr[nCnt++] = arr[i];
			}
		}
		
		if(pArr.length != 0) {
			int pMax = getMax(pArr); // 최대값 찾기
			for(int exp=1; pMax/exp>0; exp*=10) countSort(pArr, exp);
			int tmp = 0;
			for(int i=nArr.length; i<arr.length; i++) {
				arr[i] = pArr[tmp++];
			}
		}
		if(nArr.length != 0) {
			int nMax = getMax(nArr); // 최대값 찾기
			for(int exp=1; nMax/exp>0; exp*=10) countSort(nArr, exp);
			int tmp = nArr.length-1;
			for(int i=0; i<nArr.length; i++) {
				arr[i] = nArr[tmp--];
			}
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

		radixSort(arrList);

		System.out.println("ASC : " + Arrays.toString(arrList));
	}
}
