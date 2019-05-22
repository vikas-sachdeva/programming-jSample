package programming.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void solutionTest1() {
		String s = "DDUUUUDD";
		int count = solution.solution(s.length(), s);
		Assertions.assertEquals(1, count);
	}
	
	@Test
	public void solutionTest2() {
		String s = "UDDDUDUU";
		int count = solution.solution(s.length(), s);
		Assertions.assertEquals(1, count);
	}
	
	@Test
	public void solutionTest3() {
		String s = "UUUUUUUU";
		int count = solution.solution(s.length(), s);
		Assertions.assertEquals(0, count);
	}
	

	@Test
	public void solutionTest4() {
		String s = "UUDDDUDUDUDDUUU";
		int count = solution.solution(s.length(), s);
		Assertions.assertEquals(4, count);
	}

	
}
