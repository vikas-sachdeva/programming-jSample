package programming.jsample;

public class Solution {

	public int solution(int[] a, int key) {

		int low = 0;
		int high = a.length;
		int mid = 0;
		while (low != high) {
			mid = (low + high) / 2;
			if (a[mid] == key) {
				return mid;
			}
			if (key > a[mid] && key > a[high - 1]) {
				high = mid;
			} else if (key > a[mid] && key <= a[high - 1]) {
				low = mid + 1;
			} else if (key < a[mid] && key >= a[low]) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		return -1;

	}
}