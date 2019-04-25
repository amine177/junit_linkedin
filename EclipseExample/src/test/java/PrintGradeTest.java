import static org.junit.Assert.*;

import org.junit.Test;

public class PrintGradeTest {

	@Test
	public void test() {
		PrintGrade pg = new PrintGrade();
		String result = pg.print(95);
		assertEquals("You got an A!", result);
	}
	
	@Test
	public void secondTest() {
		PrintGrade pg = new PrintGrade();
		assertNotNull(pg.print(0));
	}

}
