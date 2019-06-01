package programming.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void solutionTest1() {
		long max = solution.solution(10, new int[][] { { 1, 5, 3 }, { 4, 8, 7 }, { 6, 9, 1 } });
		Assertions.assertEquals(10, max);
	}

	@Test
	public void solutionTest2() {
		long max = solution.solution(5, new int[][] { { 1, 2, 100 }, { 2, 5, 100 }, { 3, 4, 100 } });
		Assertions.assertEquals(200, max);
	}

	@Test
	public void solutionTest3() {
		long max = solution.solution(10, new int[][] { { 2, 6, 8 }, { 3, 5, 7 }, { 1, 8, 1 }, { 5, 9, 15 } });
		Assertions.assertEquals(31, max);
	}
}
