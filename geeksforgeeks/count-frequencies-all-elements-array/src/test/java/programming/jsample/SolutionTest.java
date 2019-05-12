package programming.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void solutionTest1() {
		int a[] = new int[] { 2, 3, 3, 2, 5 };
		solution.solution(a);
		Assertions.assertArrayEquals(a, new int[] { 0, 2, 2, 0, 1 });
	}

	@Test
	public void solutionTest2() {
		int a[] = new int[] { 4, 4, 4, 4 };
		solution.solution(a);
		Assertions.assertArrayEquals(a, new int[] { 0, 0, 0, 4 });
	}

	@Test
	public void solutionTest3() {
		int a[] = new int[] { 1 };
		solution.solution(a);
		Assertions.assertArrayEquals(a, new int[] { 1 });
	}

	@Test
	public void solutionTest4() {
		int a[] = new int[] { 1, 1 };
		solution.solution(a);
		Assertions.assertArrayEquals(a, new int[] { 2, 0 });
	}

}
