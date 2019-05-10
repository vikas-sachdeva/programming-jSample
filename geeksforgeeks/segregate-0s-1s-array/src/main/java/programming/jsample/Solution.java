package programming.jsample;

public class Solution {

	public void solution(int[] a) {
		int low = 0;
		int high = a.length - 1;
		while (low < high) {
			if (a[low] == 0) {
				low++;
			} else if (a[high] == 1) {
				high--;
			} else {
				a[low] = 0;
				a[high] = 1;
				low++;
				high--;
			}
		}
	}
}