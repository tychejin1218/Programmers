package online.programmers.junit;

import org.junit.Test;

import online.programmers.problem.ProblemHash42577;

public class ProblemHash42577Test {

	@Test
	public void test() {

		String[] phone_book01 = { "119", "97674223", "1195524421" };
		String[] phone_book02 = { "123", "456", "789" };
		String[] phone_book03 = { "12", "123", "1235", "567", "88 " };

		ProblemHash42577 problemHash02 = new ProblemHash42577();
		//boolean answer01 = problemHash02.solution(phone_book01);
		boolean answer02 = problemHash02.solution(phone_book02);
		//boolean answer03 = problemHash02.solution(phone_book03);

		//System.out.println("answer01 :" + answer01);
		System.out.println("answer03 :" + answer02);
		//System.out.println("answer03 :" + answer03);
	}
}
