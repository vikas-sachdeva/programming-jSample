package programming.jsample;

public class Solution {

	public int solution(int n, String s) {
		int valleyCount = 0;
		int stepCount = 0;
		for (int i = 0; i < n; i++) {

			if (s.charAt(i) == 'D') {
				stepCount--;
			} else if (s.charAt(i) == 'U') {
				stepCount++;
				if (stepCount == 0) {
					valleyCount++;
				}
			}

		}
		return valleyCount;
	}
}