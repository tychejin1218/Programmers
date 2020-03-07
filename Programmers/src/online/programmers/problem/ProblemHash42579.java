package online.programmers.problem;

import java.util.HashMap;

public class ProblemHash42579 {

	public int[] solution(String[] genres, int[] plays) {

		int[] answer = {};
		
		HashMap<Integer, String> genresMap = new HashMap<Integer, String>();
		HashMap<Integer, Integer> playsMap = new HashMap<Integer, Integer>();
		
		// key = 고유번호, value = 장르
		for (int a = 0; a < genres.length; a++) {
			genresMap.put(a, genres[a]);
		}
		
		// key = 고유번호, value = 재생된 횟수
		for (int a = 0; a < plays.length; a++) {
			playsMap.put(a, plays[a]);
		}
		
		return answer;
	}
}
