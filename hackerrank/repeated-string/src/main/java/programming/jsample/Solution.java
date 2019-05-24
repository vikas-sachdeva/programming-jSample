package programming.jsample;

public class Solution {

	public long solution(String s, long n) {
		long count = 0;
		long repatedStringCount = n / s.length();
		long remainingStringCount = n % s.length();
		int remainingACount = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a') {
				count++;
				if (i < remainingStringCount) {
					remainingACount++;
				}
			}
		}
		count = count * repatedStringCount + remainingACount;
		return count;
	}
}