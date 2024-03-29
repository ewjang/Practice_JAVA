package sec01_pattern;

import java.util.regex.Pattern;

public class PatternExample03 {

	public static void main(String[] args) {
		
		
		//문자열이 정해져 있는 형식으로 구성되어 잇는지 검증
		String regExp="(010)-\\d{3,4}-\\d{4}";
		//String regExp="(010|02|053)-\\d{3,4}-\\d{4}";
		
		String date="010-123-4567";
		//String date="053-123-4567";
		
		boolean result=Pattern.matches(regExp, date);
		
		if(result) {
			System.out.println("전화번호 정규식과 일치합니다.");
			
		}else {			System.out.println("전화번호 정규식과 일치하지 않습니다.");
		}
		
		//?는 없음 또는 1개를 의미함.
		regExp="\\w+@\\w+(\\.\\w+)?";
		//date="angel@naver.com";
		date="angel@naver.com";
		//date="angel@naver.co.kr";
		result=Pattern.matches(regExp, date);
		
		if(result) {
			System.out.println("이메일 정규식과 일치합니다.");
		}else {
				System.out.println("이메일 정규식과 일치하지 않습니다.");
			}
		}

}


