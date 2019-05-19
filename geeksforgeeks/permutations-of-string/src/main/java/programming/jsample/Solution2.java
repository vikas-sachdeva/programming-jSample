package programming.jsample;

public class Solution2 {

	public void solution(String str) {
		System.out.println("\nAll permutations of string "+str);
		print(str, 0, str.length() - 1);
	}

	public void print(String str, int l, int r) {
		if (l == r) {
			System.out.println(str);
			return;
		}
		for (int i = l; i <= r; i++) {

			str = swap(str, l, i);
			print(str, l + 1, r);
		}
	}

	private String swap(String str, int i, int j) {
		char[] arr = str.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return new String(arr);

	}

}