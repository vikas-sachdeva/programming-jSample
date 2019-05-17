package programming.jsample;

import java.util.Stack;

public class Solution {

	private Stack<Integer> stack = new Stack<Integer>();

	private Integer min;

	public Integer push(Integer item) {
		if (stack.isEmpty()) {
			stack.push(0);
			min = item;
		} else {
			stack.push(item - min);
			if (min > item) {
				min = item;
			}
		}
		return this.peek();
	}

	public Integer peek() {
		Integer item = stack.peek();
		if (item <= min) {
			int poppedEle = min;
			return poppedEle;
		} else {
			return item + min;
		}
	}

	public Integer pop() {
		Integer item = stack.pop();
		if (item <= min) {
			int poppedEle = min;
			min = min - item;
			return poppedEle;
		} else {
			return item + min;
		}
	}

	public Integer getMin() {
		return min;
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

}