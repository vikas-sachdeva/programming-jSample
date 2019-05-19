package programming.jsample;

public class Solution1 {

	public void solution(String str) {
		System.out.println("\nAll permutations of string "+str);
		print("", str);

	}

	private void print(String first, String str) {
		if (str.length() == 1) {
			System.out.println(first + str);
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			String fh = "";
			String lh = "";
			if (i != 0) {
				fh = str.substring(0, i);
			}
			if (i != str.length() - 1) {
				lh = str.substring(i + 1, str.length());
			}
			String remainStr = fh + lh;
			print(first + ch, remainStr);
		}
	}
}