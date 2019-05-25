package programming.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void solutionTest1() {
		int arr[][] = new int[][] { { -9, -9, -9, 1, 1, 1 }, { 0, -9, 0, 4, 3, 2 }, { -9, -9, -9, 1, 2, 3 },
				{ 0, 0, 8, 6, 6, 0 }, { 0, 0, 0, -2, 0, 0 }, { 0, 0, 1, 2, 4, 0 }

		};
		int max = solution.solution(arr);
		Assertions.assertEquals(28, max);
	}

	@Test
	public void solutionTest2() {
		int arr[][] = new int[][] { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 },
				{ 0, 0, 2, 4, 4, 0 }, { 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 }

		};
		int max = solution.solution(arr);
		Assertions.assertEquals(19, max);
	}

	@Test
	public void solutionTest3() {
		int arr[][] = new int[][] { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 },
				{ 0, 9, 2, -4, -4, 0 }, { 0, 0, 0, -2, 0, 0 }, { 0, 0, -1, -2, -4, 0 }

		};
		int max = solution.solution(arr);
		Assertions.assertEquals(13, max);
	}
}
