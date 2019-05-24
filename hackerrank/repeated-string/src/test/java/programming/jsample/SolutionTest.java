package programming.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void solutionTest1() {
		long count = solution.solution("aba", 10);
		Assertions.assertEquals(7, count);
	}

	@Test
	public void solutionTest2() {
		long count = solution.solution("a", 1000000000000L);
		Assertions.assertEquals(1000000000000L, count);
	}

	@Test
	public void solutionTest3() {
		long count = solution.solution("abcac", 10);
		Assertions.assertEquals(4, count);
	}
}
