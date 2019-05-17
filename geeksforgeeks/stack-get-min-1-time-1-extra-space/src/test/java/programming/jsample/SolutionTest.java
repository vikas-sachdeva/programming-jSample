package programming.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution;

	@BeforeEach
	public void initTest() {
		solution = new Solution();
	}

	@Test
	public void pushTest1() {
		Assertions.assertEquals(30, solution.push(30));
	}

	@Test
	public void pushTest2() {
		solution.push(10);
		solution.push(5);
		Assertions.assertEquals(30, solution.push(30));
	}

	@Test
	public void popTest1() {
		solution.push(10);
		solution.push(5);
		Assertions.assertEquals(5, solution.pop());
	}

	@Test
	public void popTest2() {
		solution.push(10);
		solution.push(5);
		solution.push(2);
		solution.push(1);
		solution.push(15);
		Assertions.assertEquals(15, solution.pop());
		Assertions.assertEquals(1, solution.pop());
		Assertions.assertEquals(2, solution.pop());
		Assertions.assertEquals(5, solution.pop());
	}

	@Test
	public void getMinTest1() {
		solution.push(10);
		solution.push(5);
		solution.push(2);
		solution.push(1);
		solution.push(15);
		Assertions.assertEquals(1, solution.getMin());
		solution.pop();
		solution.pop();
		Assertions.assertEquals(2, solution.getMin());
	}

	@Test
	public void isEmptyTest() {
		Assertions.assertTrue(solution.isEmpty());
	}
}
