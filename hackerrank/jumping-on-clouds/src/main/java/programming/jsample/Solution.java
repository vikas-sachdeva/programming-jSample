package programming.jsample;

public class Solution {

	public int solution(int[] c) {
		int count = 0;
		int prev0Count = 0;
		for (int i = 0; i < c.length; i++) {

			if (c[i] == 0) {
				if (prev0Count == 2) {
					count++;
					prev0Count = 1;
				} else {
					prev0Count++;
				}
			} else {
				if (prev0Count == 1) {
					prev0Count++;
				} else {
					count += 2;
					prev0Count = 0;
				}
			}
		}
		if (prev0Count == 2) {
			count++;
		}
		return count;
	}
}