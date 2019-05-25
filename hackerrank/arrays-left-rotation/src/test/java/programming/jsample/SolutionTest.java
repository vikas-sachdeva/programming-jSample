package programming.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void solutionTest1() {
		int a[] = new int[] { 1, 2, 3, 4, 5 };
		int b[] = solution.solution(a, 4);
		Assertions.assertArrayEquals(new int[] { 5, 1, 2, 3, 4 }, b);
	}

	@Test
	public void solutionTest2() {
		int a[] = new int[] { 1, 2, 3, 4, 5 };
		int b[] = solution.solution(a, 2);
		Assertions.assertArrayEquals(new int[] { 3, 4, 5, 1, 2 }, b);
	}

	@Test
	public void solutionTest3() {
		int a[] = new int[] { 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97 };
		int b[] = solution.solution(a, 13);
		Assertions.assertArrayEquals(new int[] { 87, 97, 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60 }, b);
	}

}
