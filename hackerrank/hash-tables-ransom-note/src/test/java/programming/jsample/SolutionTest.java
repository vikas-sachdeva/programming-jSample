package programming.jsample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void solutionTest1() {
		String[] magazine = new String[] { "give", "me", "one", "grand", "today", "night" };
		String[] note = new String[] { "give", "one", "grand", "today" };

		String status = solution.solution(magazine, note);
		Assertions.assertEquals("Yes", status);
	}

	@Test
	public void solutionTest2() {
		String[] magazine = new String[] { "two", "times", "three", "is", "not", "four" };
		String[] note = new String[] { "two", "times", "two", "is", "four" };

		String status = solution.solution(magazine, note);
		Assertions.assertEquals("No", status);
	}

	@Test
	public void solutionTest3() {
		String[] magazine = new String[] { "ive", "got", "a", "lovely", "bunch", "of", "coconuts" };
		String[] note = new String[] { "ive", "got", "some", "coconuts" };

		String status = solution.solution(magazine, note);
		Assertions.assertEquals("No", status);
	}

	@Test
	public void solutionTest4() {
		String[] magazine = new String[] { "give", "me", "one", "grand", "today", "night" };
		String[] note = new String[] { "Give", "one", "grand", "today" };

		String status = solution.solution(magazine, note);
		Assertions.assertEquals("No", status);
	}

	@Test
	public void solutionTest5() {
		String[] magazine = new String[] { "give", "me", "one", "grand", "today", "night" };
		String[] note = new String[] { "give" };

		String status = solution.solution(magazine, note);
		Assertions.assertEquals("Yes", status);
	}

	@Test
	public void solutionTest6() {
		String[] magazine = new String[] { "give", "me", "one", "grand", "today", "night" };
		String[] note = new String[] { "me1" };

		String status = solution.solution(magazine, note);
		Assertions.assertEquals("No", status);
	}

	@Test
	public void solutionTest7() {
		String[] magazine = new String[] { "give" };
		String[] note = new String[] { "give", "one", "grand", "today" };

		String status = solution.solution(magazine, note);
		Assertions.assertEquals("No", status);
	}

	@Test
	public void solutionTest8() {
		String[] magazine = new String[] { "give" };
		String[] note = new String[] { "give" };

		String status = solution.solution(magazine, note);
		Assertions.assertEquals("Yes", status);
	}

	@Test
	public void solutionTest9() throws IOException {

		ClassLoader classLoader = ClassLoader.getSystemClassLoader();

		File file1 = new File(classLoader.getResource("magazine1.txt").getFile());

		String[] magazine = Files.readAllLines((file1.toPath())).get(0).split(" ");
		
		File file2 = new File(classLoader.getResource("notes1.txt").getFile());
		
		String[] note = Files.readAllLines(file2.toPath()).get(0).split(" ");

		String status = solution.solution(magazine, note);
		Assertions.assertEquals("No", status);
	}
}
