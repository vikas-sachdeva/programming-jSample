package programming.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void solutionTest1() {
		int a[] = new int[] { 0, 0, 0, 1, 1, 1, 0, 0, 1 };
		solution.solution(a);
		Assertions.assertArrayEquals(a, new int[] { 0, 0, 0, 0, 0, 1, 1, 1, 1 });
	}
	

	@Test
	public void solutionTest2() {
		int a[] = new int[] { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
		solution.solution(a);
		Assertions.assertArrayEquals(a, new int[] { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1 });
	}
	
	@Test
	public void solutionTest3() {
		int a[] = new int[] { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1  };
		solution.solution(a);
		Assertions.assertArrayEquals(a, new int[] { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1 });
	}

}
