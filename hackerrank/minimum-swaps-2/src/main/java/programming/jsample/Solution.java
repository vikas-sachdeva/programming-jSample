package programming.jsample;

public class Solution {

	public int solution(int[] arr) {
		int swapCount = 0;
		int i = 0;
		while (i < arr.length) {

			if (i + 1 != arr[i]) {
				swap(arr, i, arr[i] - 1);
				swapCount++;
			} else {
				i++;
			}
		}
		return swapCount;
	}

	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}