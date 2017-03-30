import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class KataTests {
	@Test
	public void Error_Cases() {

		assertEquals(Kata.palindromization("", 2), "Error!");
		assertEquals(Kata.palindromization("123", 1), "Error!");

	}

	@Test
	public void Examples() {

		//assertEquals(Kata.palindromization("123", 2), "11");
		//assertEquals(Kata.palindromization("123", 3), "121");
		assertEquals(Kata.palindromization("123", 4), "1221");
		assertEquals(Kata.palindromization("123", 5), "12321");
		assertEquals(Kata.palindromization("123", 6), "123321");
		assertEquals(Kata.palindromization("123", 7), "1231321");
		assertEquals(Kata.palindromization("123", 8), "12311321");
		assertEquals(Kata.palindromization("123", 9), "123121321");
		assertEquals(Kata.palindromization("123", 10), "1231221321");

	}
}