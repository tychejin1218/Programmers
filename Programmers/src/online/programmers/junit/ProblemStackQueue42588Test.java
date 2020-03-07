package online.programmers.junit;

import org.junit.Test;

import online.programmers.problem.ProblemStackQueue42588;

public class ProblemStackQueue42588Test {

	@Test
	public void test() {

		//int[] heights = { 6, 9, 5, 7, 4 };
		int[] heights = { 3, 9, 9, 3, 5, 7, 2 };
		//int[] heights = { 1, 5, 3, 6, 7, 6, 5 };

		ProblemStackQueue42588 problemStackQueue42588 = new ProblemStackQueue42588();
		int[] answer = problemStackQueue42588.solution(heights);

		for (int a = 0; a < answer.length; a++) {
			System.out.println("answer[" + a + "] : " + answer[a]);
		}
	}
}
