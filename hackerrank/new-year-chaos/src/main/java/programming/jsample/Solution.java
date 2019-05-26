package programming.jsample;

public class Solution {

	public String solution(int[] q) {
		int swapCount = 0;
		int a[] = new int[q.length];
		for (int i = 0; i < q.length; i++) {
			a[i] = i + 1;
		}
		int i = 0;
		for (; i < q.length - 1; i++) {

			if (a[i] != q[i]) {

				if (q[i] == a[i + 1]) {
					swap(a, i, i + 1);
					swapCount++;
				} else if (i + 2 < q.length && q[i] == a[i + 2]) {
					swap(a, i + 1, i + 2);
					swap(a, i, i + 1);
					swapCount += 2;
				} else {
					break;
				}
			}
		}
		if (i == q.length - 1 && q[i] == a[i]) {
			return Integer.toString(swapCount);
		} else {
			return "Too chaotic";
		}
	}

	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}