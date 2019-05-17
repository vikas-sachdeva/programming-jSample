package programming.jsample;

public class Solution {

	public void solution(int[] a) {

		for (int i = 1; i < a.length; i++) {

			int j = 0;
			for (; j < i; j++) {
				if (a[i] == a[j]) {
					break;
				}
			}
			if (i != j) {
				for (int k = a[i] + 1; k < Integer.MAX_VALUE; k++) {

					int l = 0;
					for (; l < a.length; l++) {

						if (a[l] == k) {
							break;
						}
					}
					if (l == a.length) {
						a[i] = k;
						break;
					}
				}
			}
		}
	}
}