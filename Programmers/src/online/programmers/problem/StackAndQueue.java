package online.programmers.problem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		stack.push("0");
		stack.push("1");
		stack.push("2");

		Queue<String> queue = new LinkedList<String>();
		queue.offer("0");
		queue.offer("1");
		queue.offer("2");
		
		/*queue.add("3");
		queue.add("4");
		queue.add("5");*/

		System.out.println("Stack ===== S");
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
		System.out.println("Stack ===== E");

		System.out.println("Queue ===== S");
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		System.out.println("Queue ===== E");		
	}
}
