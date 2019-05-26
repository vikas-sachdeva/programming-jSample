package programming.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void solutionTest1() {
		int q[] = new int[] { 7, 1, 3, 2, 4, 5, 6 };
		int count = solution.solution(q);
		Assertions.assertEquals(5, count);
	}

	@Test
	public void solutionTest2() {
		int q[] = new int[] { 4, 3, 1, 2 };
		int count = solution.solution(q);
		Assertions.assertEquals(3, count);
	}

	@Test
	public void solutionTest3() {
		int q[] = new int[] { 2, 3, 4, 1, 5 };
		int count = solution.solution(q);
		Assertions.assertEquals(3, count);
	}

	@Test
	public void solutionTest4() {
		int q[] = new int[] { 1, 3, 5, 2, 4, 6, 7 };
		int count = solution.solution(q);
		Assertions.assertEquals(3, count);
	}

}
