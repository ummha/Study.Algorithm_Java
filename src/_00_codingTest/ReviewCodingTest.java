package _00_codingTest;

import java.util.Locale;

public class ReviewCodingTest {

	public String solution(String new_id){
		String answer = "";
		answer = new_id.toLowerCase();	// 1단계
		answer = answer.replaceAll("[^-_.a-z0-9]", "");	// 2단계
		answer = answer.replaceAll("\\.{2,}", ".");	// 3단계
		answer = answer.replaceAll("^[.]|[.]$","");	// 4단계
		if(answer.length() == 0) answer += "a";	// 5단계
		if(answer.length() >= 16) {
			answer = answer.substring(0, 15);	// 6단계
			answer = answer.lastIndexOf(".") == answer.length()-1 ? answer.replaceAll("^[.]|[.]$","") : answer;
		}
		if(answer.length() <= 2) {
			String addStr = answer.substring(answer.length()-1, answer.length());
			while(answer.length() < 3)
				answer += addStr;
		}

		return answer;
	}

	public static void main(String[] args) {
		ReviewCodingTest c = new ReviewCodingTest();
		String result = c.solution("abcdefghijklmn.p");
		System.out.println(result);
	}
}
