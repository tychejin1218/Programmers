package online.programmers.problem;

import java.util.HashMap;
import java.util.Map;

public class ProblemHash42577 {

	public boolean solution(String[] phone_book) {

		boolean answer = true;

		Map<String, Integer> phone_book_map = new HashMap<String, Integer>();

		// 전화번호부에 적힌 전화번호 중 접두어가 가능한 번호를 찾아 Map에 저장 
		for (int a = 0; a < phone_book.length; a++) {
			for (int b = 1; b < phone_book[a].length(); b++) {
				phone_book_map.put(phone_book[a].substring(0, b), 1);
			}
		}
		
		// 접두어가 저장된 Map을 확인
		/*for (Map.Entry<String, Integer> entry : phone_book_map.entrySet()) {
            System.out.println("[key]:" + entry.getKey() + ", [value]:" + entry.getValue());
        }*/

		// 접두어가 저장된 Map에 전화번호부에 적힌 전화번호가 있는지 확인
		for (int a = 0; a < phone_book.length; a++) {			
			if (phone_book_map.containsKey(phone_book[a])) {				
				answer = false;
				break;
			}
		}
		
		return answer;
	}
}
