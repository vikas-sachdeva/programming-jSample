package programming.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void solutionTest1() {
		int a[] = new int[] { 1, 2, 1, 2, 1, 3, 2 };
		int count = solution.solution(a.length, a);
		Assertions.assertEquals(2, count);
	}

	@Test
	public void solutionTest2() {
		int a[] = new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		int count = solution.solution(9, a);
		Assertions.assertEquals(3, count);
	}

	@Test
	public void solutionTest3() {
		int a[] = new int[] { 1, 1, 100, 100 };
		int count = solution.solution(4, a);
		Assertions.assertEquals(2, count);
	}

	@Test
	public void solutionTest4() {
		int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int count = solution.solution(10, a);
		Assertions.assertEquals(0, count);
	}

}
