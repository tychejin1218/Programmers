package online.programmers.junit;

import org.junit.Test;

import online.programmers.problem.ProblemHash42576;

public class ProblemHash42576Test {

	@Test
	public void test() {

		ProblemHash42576 problemHash01 = new ProblemHash42576();

		// String[] participant = { "leo", "kiki", "eden" };
		// String[] completion = { "leo", "kiki" };

		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "mislav", "stanko", "ana" };

		String answer = problemHash01.solution(participant, completion);

		System.out.println("answer : " + answer);
	}

}
