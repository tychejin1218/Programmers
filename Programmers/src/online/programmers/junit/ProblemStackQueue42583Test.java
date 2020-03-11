package online.programmers.junit;

import org.junit.Test;

import online.programmers.problem.ProblemStackQueue42583;

public class ProblemStackQueue42583Test {

	@Test
	public void test() {

		int answer = 0;
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = { 7, 4, 5, 6 };

		ProblemStackQueue42583 problemStackQueue42583 = new ProblemStackQueue42583();
		answer = problemStackQueue42583.solution(bridge_length, weight, truck_weights);

		System.out.println("answer : " + answer);
	}
}
