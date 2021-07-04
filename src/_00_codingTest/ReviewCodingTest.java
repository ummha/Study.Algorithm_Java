package _00_codingTest;

public class ReviewCodingTest {

	public static int solution(int n, int[] lost, int[] reserve) {
		int[] student = new int[n];
		int answer = n;

		for(int i : lost)
			student[i -1]--;
		for(int i : reserve)
			student[i - 1]++;

		for(int i=0; i<student.length; i++){
			if(student[i] == -1){
				if(i-1 >= 0 && student[i-1]==1){
					student[i]++;
					student[i-1]--;
				}else if(i+1 < student.length && student[i+1]==1){
					student[i]++;
					student[i]--;
				}else{
					answer--;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] lost = {3, 4};
		int[] reserve = {1, 3, 5};
		System.out.println(solution(5, lost, reserve));
	}
}
