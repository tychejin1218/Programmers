package online.programmers.problem;

import java.util.HashMap;
import java.util.Map;

public class ProblemHash42576 {

	public String solution(String[] participant, String[] completion) {
		
		String answer = "";
		 
        Map<String, Integer> solutionMap = new HashMap<String, Integer>();
 
        // 마라톤의 참여한 선수를 Map 저장 시  기본으로 value에 0을 저장하고, 동명이인 경우 value 값을 1씩 증가
        for (String element : participant) {
            solutionMap.put(element, solutionMap.getOrDefault(element, 0) + 1);
        }
 
        // 마라톤의 참여한 선수를 Map 저장 시 value 값을 1씩 감소
        for (String element : completion) {
            solutionMap.put(element, solutionMap.get(element) - 1);
        }
        
        // 저장된 Map을 확인
        for (Map.Entry<String, Integer> entry : solutionMap.entrySet()) {
			System.out.println("[key]:" + entry.getKey() + ", [value]:" + entry.getValue());
		}
 
        // value 값이 0 이상인 경우는 완주하지 못한 것으로 판단
        for (String key : solutionMap.keySet()) {
            if (solutionMap.get(key) > 0) {
                answer = key;
                break;
            }
        }
 
        return answer;
	}
}
