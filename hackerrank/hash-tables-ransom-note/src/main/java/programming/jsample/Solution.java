package programming.jsample;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public String solution(String[] magazine, String[] note) {
		
		Map<String, Integer> wordCountMap = new HashMap<>();
		for (int i = 0; i < magazine.length; i++) {

			Integer count = wordCountMap.get(magazine[i]);
			if (count == null) {
				wordCountMap.put(magazine[i], 1);
			} else {
				wordCountMap.put(magazine[i], count + 1);
			}
		}
		int i = 0;
		for (; i < note.length; i++) {

			Integer count = wordCountMap.get(note[i]);
			if (count == null || count == 0) {
				break;
			} else {
				wordCountMap.put(note[i], count - 1);
			}
		}
		if (i == note.length) {
			return "Yes";
		} else {
			return "No";
		}
	}
}