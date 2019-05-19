package programming.jsample;

import org.junit.jupiter.api.Test;

public class SolutionTest2 {

	private Solution2 solution = new Solution2();

	@Test
	public void solutionTest1() {
		solution.solution("AB");
	}
	
	@Test
	public void solutionTest2() {
		solution.solution("ABC");
	}
	
	@Test
	public void solutionTest3() {
		solution.solution("ABCD");
	}
	
	@Test
	public void solutionTest4() {
		solution.solution("A");
	}

}
