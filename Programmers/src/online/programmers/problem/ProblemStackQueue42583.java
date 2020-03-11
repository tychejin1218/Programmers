package online.programmers.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class ProblemStackQueue42583 {

	public int solution(int bridge_length, int weight, int[] truck_weights) {

		int answer = 0;

		// 대기 트럭의 무게를 Queue에 저장
		Queue<Integer> waitTruckQueue = new LinkedList<Integer>();

		for (int truckWeight : truck_weights) {
			waitTruckQueue.add(truckWeight);
		}

		// 이동한 시간.
		int time = 0;

		// 다리위에있는 총 무게
		int totalWeight = waitTruckQueue.peek();

		System.out.println("totalWeight : " + totalWeight);

		// 다리를 건너는 트럭
		List<Map<Integer, Integer>> moveTruckList = new ArrayList<Map<Integer, Integer>>();

		Map<Integer, Integer> tempTruckMap = new HashMap<Integer, Integer>();
		tempTruckMap.put(waitTruckQueue.poll(), 0);

		// 첫번째 트럭은 넣어주기 working에
		moveTruckList.add(tempTruckMap);

		// 운행중 트럭이 모두 없어질때까지
		while (!moveTruckList.isEmpty()) {

			time++;

			// 이동중인 버스가 있으면 모두 한칸 씩 이동시켜준다.
			for (int i = 0; i < moveTruckList.size(); i++) {
				moveTruckList.get(i);
			}

			// 도착한 트럭이있으면 빼준다.
			// 끝까지 갔으면 working에서 제외시켜준다.
			/*
			 * if (moveTruckList.get(0).index > bridge_length) { totalWeight -=
			 * moveTruckList.get(0).weight; moveTruckList.remove(0); }
			 */

			// 더 올릴 수 있는경우에는 대기에서 빼주고 working에 넣어준다.
			/*
			 * if (!waitTruckQueue.isEmpty() && totalWeight +
			 * waitTruckQueue.peek() <= weight) { int nextTruck =
			 * waitTruckQueue.poll(); totalWeight += nextTruck;
			 * moveTruckList.add(new Truck(nextTruck, 1)); }
			 */
		}

		answer = time;

		return answer;
	}

	static class Truck {
		int weight = 0;
		int index = 0;

		public Truck(int weight, int index) {
			this.weight = weight;
			this.index = index;
		}
	}// Truck
}
