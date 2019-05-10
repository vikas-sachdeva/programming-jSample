package programming.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void solutionTest1() {
		int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		int actual = solution.solution(a, 4);
		Assertions.assertEquals(3, actual);
	}

	@Test
	public void solutionTest2() {
		int a[] = new int[] { 10, 20, 30, 40, 50, 60, 111, 220, 430, 433, 456, 478, 498, 500, 510, 555, 556, 557, 589 };
		int actual = solution.solution(a, 220);
		Assertions.assertEquals(7, actual);
	}

	@Test
	public void solutionTest3() {
		int a[] = new int[] { 10, 20, 30, 40, 50, 60, 111, 220, 430, 433, 456, 478, 498, 500, 510, 555, 556, 557, 589 };
		int actual = solution.solution(a, 222);
		Assertions.assertEquals(-1, actual);
	}

	@Test
	public void solutionTest4() {
		int a[] = new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		int actual = solution.solution(a, 1);
		Assertions.assertEquals(-1, actual);
	}

	@Test
	public void solutionTest5() {
		int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		int actual = solution.solution(a, 14);
		Assertions.assertEquals(-1, actual);
	}

	@Test
	public void solutionTest6() {
		int a[] = new int[] { 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13 };
		int actual = solution.solution(a, 6);
		Assertions.assertEquals(-1, actual);
	}

	@Test
	public void solutionTest7() {
		int a[] = new int[] { 10, 20, 30, 40, 50, 60, 111, 220, 430, 433, 456, 478, 498, 500, 510, 555, 556, 557, 589 };
		int actual = solution.solution(a, 557);
		Assertions.assertEquals(17, actual);
	}

	@Test
	public void solutionTest8() {
		int a[] = new int[] { 10, 20, 30, 40, 50, 60, 111, 220, 430, 433, 456, 478, 498, 500, 510, 555, 556, 557, 589 };
		int actual = solution.solution(a, 589);
		Assertions.assertEquals(18, actual);
	}
	
	@Test
	public void solutionTest9() {
		int a[] = new int[] { 10, 20, 30, 40, 50, 60, 111, 220};
		int actual = solution.solution(a, 220);
		Assertions.assertEquals(7, actual);
	}
}
