package online.programmers.problem;

import java.util.Stack;

public class ProblemStackQueue42588 {

	public int[] solution(int[] heights) {

		int heightsLen = heights.length;

		int[] answer = new int[heightsLen];

		Stack<Integer> heightsStack = new Stack<Integer>();

		// 탑의 높이를 담은 배열을 Stack에 저장
		for (int a = 0; a < heightsLen; a++) {
			// System.out.println("heights[a] : " + heights[a]);
			heightsStack.push(heights[a]);
		}

		// 
		while (!heightsStack.isEmpty()) {
			// Stack에 저장된 탑의 높이
			int height = heightsStack.pop();
			// System.out.println("height : " + height);			
			int heightsStackSize = heightsStack.size();
			for (int a = heightsStackSize; a >= 0; a--) {
				// 탑이 쏜 신호를 받는 탑을 구함
				if (height < heights[a]) {
					answer[heightsStackSize] = a + 1;
					break;
				}
			}
		}

		return answer;
	}
}
