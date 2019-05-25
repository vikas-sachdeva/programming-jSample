package programming.jsample;

public class Solution {

	public int[] solution(int[] a, int d) {
		if (d == a.length) {
			return a;
		}
		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			b[i] = a[(i + d) % a.length];
		}
		return b;
	}
}