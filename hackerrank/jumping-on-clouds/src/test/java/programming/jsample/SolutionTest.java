package programming.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void solutionTest1() {
		int a[] = new int[] { 0, 1, 0, 0, 0, 1, 0 };
		int count = solution.solution(a);
		Assertions.assertEquals(3, count);
	}

	@Test
	public void solutionTest2() {
		int a[] = new int[] { 0, 0, 1, 0, 0, 1, 0 };
		int count = solution.solution(a);
		Assertions.assertEquals(4, count);
	}

	@Test
	public void solutionTest3() {
		int a[] = new int[] { 0, 0, 0, 0, 1, 0 };
		int count = solution.solution(a);
		Assertions.assertEquals(3, count);
	}

	@Test
	public void solutionTest4() {
		int a[] = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int count = solution.solution(a);
		Assertions.assertEquals(4, count);
	}

	@Test
	public void solutionTest5() {
		int a[] = new int[] { 0, 0, 0, 1, 0, 0 };
		int count = solution.solution(a);
		Assertions.assertEquals(3, count);
	}

}
