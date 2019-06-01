package programming.jsample;

public class Solution {

	public long solution(int n, int[][] queries) {
		long max = 0;
		long arr[] = new long[n + 1];
		for (int i = 0; i < queries.length; i++) {
			arr[queries[i][0]] += queries[i][2];
			if (queries[i][1] < n) {
				arr[queries[i][1] + 1] -= queries[i][2];
			}
		}
		long temp = 0;
		for (int i = 1; i < n + 1; i++) {
			temp = temp + arr[i];
			if (temp > max) {
				max = temp;
			}
		}

		return max;
	}
}