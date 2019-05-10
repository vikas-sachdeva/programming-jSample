package programming.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void solutionTest1() {
		int a[] = new int[] { 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6 };
		int actual = solution.solution(a, 7);
		Assertions.assertEquals(0, actual);
	}

	@Test
	public void solutionTest2() {
		int a[] = new int[] { 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6 };
		int actual = solution.solution(a, 5);
		Assertions.assertEquals(11, actual);
	}

	@Test
	public void solutionTest3() {
		int a[] = new int[] { 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6 };
		int actual = solution.solution(a, 6);
		Assertions.assertEquals(12, actual);
	}

	@Test
	public void solutionTest4() {
		int a[] = new int[] { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		int actual = solution.solution(a, 3);
		Assertions.assertEquals(8, actual);
	}

	@Test
	public void solutionTest5() {
		int a[] = new int[] { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		int actual = solution.solution(a, 30);
		Assertions.assertEquals(-1, actual);
	}

	@Test
	public void solutionTest6() {
		int a[] = new int[] { 30, 40, 50, 10, 20 };
		int actual = solution.solution(a, 10);
		Assertions.assertEquals(3, actual);
	}

	@Test
	public void solutionTest7() {
		int a[] = new int[] { 10, 20, 30, 40, 50, 60, 111, 220, 430, 433, 456, 478, 498, 500, 510, 555, 556, 557, 589 };
		int actual = solution.solution(a, 498);
		Assertions.assertEquals(12, actual);
	}

	@Test
	public void solutionTest8() {
		int a[] = new int[] { 60, 111, 220, 430, 433, 456, 478, 498, 500, 510, 555, 556, 557, 589, 10, 20, 30, 40, 50 };
		int actual = solution.solution(a, 498);
		Assertions.assertEquals(7, actual);
	}

}
