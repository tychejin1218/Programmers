package online.programmers.junit;

import org.junit.Test;

import online.programmers.problem.ProblemHash42579;

public class ProblemHash42579Test {

	@Test
	public void test() {

		int[] answer = {};
		
		// 42579
		String[] genres = { "classic", "pop", "classic", "classic", "pop" };
		int[] plays = { 500, 600, 150, 800, 2500 };

		ProblemHash42579 problemHash04 = new ProblemHash42579();
		answer = problemHash04.solution(genres, plays);

		System.out.println("answer : " + answer);
	}
}
