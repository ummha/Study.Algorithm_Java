package _01_basic.sort._06_heap;

import java.util.Arrays;
import java.util.Random;

public class HeapSort {
	static final String ASC = "ASC";
	static final String DESC = "DESC";
	
	/**
	 * 힙을 활용해 최대값 추출하기
	 * @param arr
	 * @return
	 */
	public static int getMaxVal(int[] arr) {
		int length = arr.length;
		for(int i = length / 2 - 1; i >= 0; i--) {
			int posi = i;
			int leftChild = i * 2 + 1;
			int rightChild = i * 2 + 2;
			if (leftChild < length && arr[posi] < arr[leftChild]) {
				posi = leftChild;
			}
			
			if (rightChild < length && arr[posi] < arr[rightChild]) {
				posi = rightChild;
			}
			
			if (i != posi) {
				swap(arr, posi, i);
			}
		}
	    return arr[0];
	}
	
	/**
	 * 힙을 활용해 최소값 추출하기
	 * @param arr
	 * @return
	 */
	public static int getMinVal(int[] arr) {
		int length = arr.length;
		for(int i = length / 2 - 1; i >= 0; i--) {
			int posi = i;
			int leftChild = i * 2 + 1;
			int rightChild = i * 2 + 2;
			
			if (leftChild < length && arr[posi] > arr[leftChild]) {
				posi = leftChild;
			}
			
			if (rightChild < length && arr[posi] > arr[rightChild]) {
				posi = rightChild;
			}
			
			if (i != posi) {
				swap(arr, posi, i);
			}
		}
		return arr[0];
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
     * 힙 정렬
     * @param arr
     * @param way
     */
	public static void heapSort(int[] arr, String way) {
		int length  = arr.length;
		
		// init, max / min heap
		for(int i = length / 2 - 1; i >= 0; i--) {
			if(way.equals(ASC)) maxHeapify(arr, length, i);
			else if(way.equals(DESC)) minHeapify(arr, length, i);
		}
		
		// for extract max / min element from heap
	    for (int i = length - 1; i > 0; i--) {
	        swap(arr, 0, i);
	        if(way.equals(ASC)) maxHeapify(arr, i, 0);
	        else if(way.equals(DESC)) minHeapify(arr, i, 0);
	    }
	}
	
	/**
	 * 힙 성질을 만족하도록 하며 오름차순으로 위치 교환
	 * @param arr
	 * @param length
	 * @param i
	 */
	private static void maxHeapify(int[] arr, int length, int i) {
	    int posi = i;
	    int leftChild = i * 2 + 1;
	    int rightChild = i * 2 + 2;
	    if (leftChild < length && arr[posi] < arr[leftChild]) {
	        posi = leftChild;
	    }
	 
	    if (rightChild < length && arr[posi] < arr[rightChild]) {
	        posi = rightChild;
	    }
	 
	    if (i != posi) {
	        swap(arr, posi, i);
	        maxHeapify(arr, length, posi);
	    }
	}
	
	/**
	 * 힙 성질을 만족하도록 하며 내림차순으로 위치 교환
	 * @param arr
	 * @param length
	 * @param i
	 */
	private static void minHeapify(int[] arr, int length, int i) {
		int posi = i;
		int leftChild = i * 2 + 1;
		int rightChild = i * 2 + 2;
		
		if (leftChild < length && arr[posi] > arr[leftChild]) {
			posi = leftChild;
		}
		
		if (rightChild < length && arr[posi] > arr[rightChild]) {
			posi = rightChild;
		}
		
		if (i != posi) {
			swap(arr, posi, i);
			minHeapify(arr, length, posi);
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
		
		System.out.println("MAX : " + getMaxVal(arrList));
		System.out.println("MIN : " + getMinVal(arrList));

		heapSort(arrList, ASC);

		System.out.println("ASC : " + Arrays.toString(arrList));

		heapSort(arrList, DESC);

		System.out.println("DESC : " + Arrays.toString(arrList));
		
	}
}
