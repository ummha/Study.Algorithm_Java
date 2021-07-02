package _00_codingTest;

import java.util.Arrays;
import java.util.Locale;

public class ReviewCodingTest {

	public int[] solution(int[] array, int[][] commands){
		int[] answer = new int[commands.length];

		for(int idx=0; idx<commands.length; idx++){
			int i = commands[idx][0];
			int j = commands[idx][1];
			int k = commands[idx][2];

			if(i==j) {
				answer[idx] = array[j-1];
				continue;
			}

			int x=0;
			int[] newArr = new int[j-i+1];
			for(int tmp=i-1; tmp<j; tmp++){
				newArr[x++] = array[tmp];
			}

			sort(newArr);

			answer[idx] = newArr[k-1];
		}

		return answer;
	}

	private void sort(int[] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		ReviewCodingTest c = new ReviewCodingTest();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] result = c.solution(array, commands);
		System.out.println(Arrays.toString(result));
	}
}
