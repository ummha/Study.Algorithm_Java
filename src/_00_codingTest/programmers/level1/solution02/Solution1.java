package _00_codingTest.programmers.level1.solution02;

public class Solution1 {

	// 패드 번호의 좌표를 배열에 담는다.
	int[][] numpadPos = {
			{3, 1},		//0
			{0, 0},		//1
			{0, 1},		//2
			{0, 2},		//3
			{1, 0},		//4
			{1, 1},		//5
			{1, 2},		//6
			{2, 0},		//7
			{2, 1},		//8
			{2, 2},		//9
	};

	//초기위치 좌표
	int[] leftPos = {3, 0};		//'*'
	int[] rightPos = {3, 2};	//'#'

	String hand;

	public String solution(int[] numbers, String hand) {
		this.hand = (hand.equals("right")) ? "R" : "L";

		String answer = "";

		for(int i=0; i<numbers.length; i++) {
			String umji = pushNumber(numbers[i]);
			answer += umji;

			if(umji.equals("L")) {
				leftPos = numpadPos[numbers[i]];
				continue;
			}
			if(umji.equals("R")) {
				rightPos = numpadPos[numbers[i]];
				continue;
			}

		}

		return answer;
	}

	// 번호를 누를 때 어느 손을 사용하는가
	private String pushNumber(int num) {
		if(num==1 || num==4 || num==7) return "L";
		if(num==3 || num==6 || num==9) return "R";

		// 2,5,8,0 일때 가까운 손 분기처리
		if(getDist(leftPos, num) > getDist(rightPos, num)) return "R";
		if(getDist(leftPos, num) < getDist(rightPos, num)) return "L";

		//거리가 같으면 손잡이 우선권
		return this.hand;
	}

	//해당 위치와 번호 위치의 거리
	private int getDist(int[] pos, int num) {
		// Math.abs() : 인자값에 대한 절대값을 반환하는 함수.
		return Math.abs(pos[0] - numpadPos[num][0]) + Math.abs(pos[1] - numpadPos[num][1]);
	}

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int[] intArr1 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand1 = "right";
		int[] intArr2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand2 = "left";
		int[] intArr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String hand3 = "right";
		
		String result = "";
		result = s.solution(intArr1, hand1);
		System.out.println("result 1 : " + result);
		result = s.solution(intArr2, hand2);
		System.out.println("result 2 : " + result);
		result = s.solution(intArr3, hand3);
		System.out.println("result 3 : " + result);
	}
}
