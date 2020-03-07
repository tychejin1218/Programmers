package online.programmers.problem;

import java.util.HashMap;
import java.util.Map;

public class ProblemHash42578 {

	public int solution(String[][] clothes) {

		int answer = 1;

		Map<String, Integer> clothesMap = new HashMap<String, Integer>();

		// Map 저장 시 key 값은 의상 종류, value 값은 기본으로 1을 저장하고 key가 중복되는 경우 1씩 증가
		for (int a = 0; a < clothes.length; a++) {
			String clothesType = clothes[a][1];
			clothesMap.put(clothesType, clothesMap.getOrDefault(clothesType, 0) + 1);
		}

		// Map에 저장된 의상 종류의 갯수 확인
		/*for (Map.Entry<String, Integer> entry : clothesMap.entrySet()) {
			System.out.println("[key]:" + entry.getKey() + ", [value]:" + entry.getValue());
		}*/

		// 의상 종류의 갯수에서 의상을 선택하지 않는 경우 수가 있기 때문에 1 증가
		for (int value : clothesMap.values()) {
			answer *= (value + 1);
		}

		// 서로 다른 옷의 조합의 수 증 의상을 입지 않은 경우의 수 없기 때문에 1 감소
		answer -= 1;

		return answer;
	}
}
