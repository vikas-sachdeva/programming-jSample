package programming.jsample;

public class Solution {

	public void solution(int[] a) {

		int i = 0;
		while (i < a.length) {

			if (a[i] < 0) {
				i++;
				continue;
			}
			int index = a[i] - 1;

			if (a[index] > 0) {
				a[i] = a[index];
				a[index] = -1;
			} else {
				a[index]--;
				a[i] = 0;
				i++;
			}
		}
		for (int j = 0; j < a.length; j++) {
			a[j] = Math.abs(a[j]);
		}

	}
}