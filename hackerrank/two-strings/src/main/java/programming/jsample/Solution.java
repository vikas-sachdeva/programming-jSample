package programming.jsample;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public String solution(String s1, String s2) {
		Set<Character> charSet = new HashSet<>();
		char[] s1Array = s1.toCharArray();
		for (int i = 0; i < s1Array.length; i++) {
			charSet.add(s1Array[i]);
		}
		int i = 0;
		char[] s2Array = s2.toCharArray();
		for (; i < s2Array.length; i++) {
			if (charSet.contains(s2Array[i])) {
				break;
			}
		}
		if (i == s2Array.length) {
			return "NO";
		} else {
			return "YES";
		}
	}
}