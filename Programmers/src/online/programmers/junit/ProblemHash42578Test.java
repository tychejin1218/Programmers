package online.programmers.junit;

import org.junit.Test;

import online.programmers.problem.ProblemHash42578;

public class ProblemHash42578Test {

	@Test
	public void test() {

		int answer = 0;

		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
				
		//String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
				
		ProblemHash42578 problemHash03 = new ProblemHash42578();
		answer = problemHash03.solution(clothes);

		System.out.println("answer : " + answer);
	}
}
