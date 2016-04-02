package fizzbuzzwhizz;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class FizzBuzzWhizzTest {

	@Test
	public void no_fizz_buzz_whizz() {
		assertEquals(Arrays.asList("1"), FizzBuzzWhizz.count(1));
		assertEquals(Arrays.asList("1", "2"), FizzBuzzWhizz.count(2));
	}

}
