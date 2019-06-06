package programming.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void solutionTest1() {
		String s1 = "hello";
		String s2 = "world";

		String status = solution.solution(s1, s2);
		Assertions.assertEquals("Yes", status);
	}

	@Test
	public void solutionTest2() {
		String s1 = "hi";
		String s2 = "world";

		String status = solution.solution(s1, s2);
		Assertions.assertEquals("No", status);
	}

}
