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

	@Test
	public void count_first_fizz() {
		assertEquals(Arrays.asList("1", "2", "Fizz"), FizzBuzzWhizz.count(3));
	}

	@Test
	public void count_first_buzz() {
		assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz"), FizzBuzzWhizz.count(5));
	}
}
