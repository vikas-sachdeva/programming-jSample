package programming.jsample;

public class Solution {

	public int solution(int[] a, int key) {

		int low = 0;
		int high = 1;

		while (key > a[high] && low < high) {
			low = high;
			high = high * 2;
			if (high >= a.length) {
				high = a.length - 1;
			}
		}
		return binarySearch(a, key, low, high + 1);

	}

	private int binarySearch(int[] a, int key, int low, int high) {
		int mid;
		while (low != high) {
			mid = (low + high) / 2;
			if (key == a[mid]) {
				return mid;
			}
			if (key > a[mid]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return -1;
	}
}