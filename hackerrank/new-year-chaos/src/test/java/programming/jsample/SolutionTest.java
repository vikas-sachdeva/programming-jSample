package programming.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void solutionTest1() {
		int q[] = new int[] { 2, 1, 5, 3, 4 };
		String result = solution.solution(q);
		Assertions.assertEquals("3", result);
	}

	@Test
	public void solutionTest2() {
		int q[] = new int[] { 2, 5, 1, 3, 4 };
		String result = solution.solution(q);
		Assertions.assertEquals("Too chaotic", result);
	}

	@Test
	public void solutionTest3() {
		int q[] = new int[] { 5, 1, 2, 3, 7, 8, 6, 4 };
		String result = solution.solution(q);
		Assertions.assertEquals("Too chaotic", result);
	}

	@Test
	public void solutionTest4() {
		int q[] = new int[] { 1, 2, 5, 3, 7, 8, 6, 4 };
		String result = solution.solution(q);
		Assertions.assertEquals("7", result);
	}

	@Test
	public void solutionTest5() {
		int q[] = new int[] { 1, 2, 5, 3, 4, 7, 8, 6 };
		String result = solution.solution(q);
		Assertions.assertEquals("4", result);
	}

}
