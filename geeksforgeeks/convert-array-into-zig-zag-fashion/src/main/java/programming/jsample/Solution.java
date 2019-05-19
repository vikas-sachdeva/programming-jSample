package programming.jsample;

public class Solution {

	public int[] solution(int[] a) {
		int temp;
		for (int i = 1; i < a.length; i++) {

			if (i % 2 == 1) {
				if (a[i] < a[i - 1]) {
					temp = a[i - 1];
					a[i - 1] = a[i];
					a[i] = temp;
				}
			} else {
				if (a[i] > a[i - 1]) {
					temp = a[i - 1];
					a[i - 1] = a[i];
					a[i] = temp;
				}
			}
		}
		return a;
	}
}