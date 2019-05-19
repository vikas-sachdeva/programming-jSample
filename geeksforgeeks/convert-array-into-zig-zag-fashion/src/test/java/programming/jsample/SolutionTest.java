package programming.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void solutionTest1() {
		int a[] = new int[] { 4, 3, 7, 8, 6, 2, 1 };
		int b[] = solution.solution(a);
		Assertions.assertArrayEquals(new int[] { 3, 7, 4, 8, 2, 6, 1 }, b);
	}

	@Test
	public void solutionTest2() {
		int a[] = new int[] { 1, 4, 3, 2 };
		int b[] = solution.solution(a);
		Assertions.assertArrayEquals(new int[] { 1, 4, 2, 3 }, b);
	}

	@Test
	public void solutionTest3() {
		int a[] = new int[] { 1, 4 };
		int b[] = solution.solution(a);
		Assertions.assertArrayEquals(new int[] { 1, 4 }, b);
	}

	@Test
	public void solutionTest4() {
		int a[] = new int[] { 1, 2, 3, 4, 5, 6 };
		int b[] = solution.solution(a);
		Assertions.assertArrayEquals(new int[] { 1, 3, 2, 5, 4, 6 }, b);
	}

}
