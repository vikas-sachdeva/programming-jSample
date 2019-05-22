package programming.jsample;

public class Solution {

	public int solution(int n, int[] ar) {
		int count = 0;
		boolean b[] = new boolean[100];
		for (int i = 0; i < n; i++) {
			if (b[ar[i] - 1]) {
				count++;
				b[ar[i] - 1] = false;
			} else {
				b[ar[i] - 1] = true;
			}
		}
		return count;
	}
}