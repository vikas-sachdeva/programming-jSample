package programming.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void solutionTest1() {
		int a[] = new int[] { 1, 2, 2, 5, 8, 8, 8 };
		solution.solution(a);
		Assertions.assertArrayEquals(a, new int[] { 1, 2, 3, 5, 8, 9, 10 });
	}

	@Test
	public void solutionTest2() {
		int a[] = new int[] { 1, 2, 5, 7, 8, 8, 7 };
		solution.solution(a);
		Assertions.assertArrayEquals(a, new int[] { 1, 2, 5, 7, 8, 9, 10 });
	}

	@Test
	public void solutionTest3() {
		int a[] = new int[] { 9, 9, 9, 9, 9 };
		solution.solution(a);
		Assertions.assertArrayEquals(a, new int[] { 9, 10, 11, 12, 13 });
	}
	
	@Test
	public void solutionTest4() {
		int a[] = new int[] { 1, 2, 5, 8, 8, 7 };
		solution.solution(a);
		Assertions.assertArrayEquals(a, new int[] { 1, 2, 5, 8, 9, 7 });
	}

}
