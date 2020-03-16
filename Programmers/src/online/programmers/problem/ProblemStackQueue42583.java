package online.programmers.problem;

import java.util.LinkedList;
import java.util.Queue;

public class ProblemStackQueue42583 {

	public int solution(int bridge_length, int weight, int[] truck_weights) {
		
		// 모든 트럭이 다리를 건너는데 걸린 시간
		int answer = 0;

		// 트럭이 다리를 건너는 총 시간(다리에 완전히 오르는 시간 + 다리의 길이)
		int[] moveTrunkTotalTime = new int[truck_weights.length];

		// 다리를 건너는 트럭 순서의 목록
		Queue<Integer> moveTruckNumberQueue = new LinkedList<Integer>();

		// 다리를 건너는 트럭 중 첫 번째 트럭의 순서
		int moveTruckNumber = 0;

		while (true) {

			// 다리를 지난 트럭은 Queue에서 삭제
			if (!moveTruckNumberQueue.isEmpty() && moveTrunkTotalTime[moveTruckNumberQueue.peek()] == answer) {
				weight += truck_weights[moveTruckNumberQueue.poll()];
			}

			// 대기 트럭이 있는 경우 다리가 견딜 수 있는 무게를 비교하여 Queue에 추가
			if (moveTruckNumber < truck_weights.length && truck_weights[moveTruckNumber] <= weight) {
				moveTruckNumberQueue.add(moveTruckNumber);
				moveTrunkTotalTime[moveTruckNumber] = answer + bridge_length;
				weight -= truck_weights[moveTruckNumber];
				moveTruckNumber++;
			}

			answer++;

			if (moveTruckNumberQueue.isEmpty()) {
				break;
			}
		}

		return answer;
	}
}
