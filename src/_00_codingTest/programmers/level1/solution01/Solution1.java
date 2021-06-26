package _00_codingTest.programmers.level1.solution01;

import java.util.HashMap;

public class Solution1 {
	
	/**
	 * HashMap을 사용한 솔수션
	 * @param participant
	 * @param completion
	 * @return
	 */
	public String solution(String[] participant, String[] completion) {
		String answer = "";

		HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
                break;
            }
        }

		return answer;
	}

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		Solution1 s = new Solution1();
		String result = s.solution(participant, completion);
		System.out.println(result);
	}
}
