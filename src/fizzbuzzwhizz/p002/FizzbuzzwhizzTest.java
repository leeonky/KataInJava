package fizzbuzzwhizz.p002;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class FizzbuzzwhizzTest {

	@Test
	public void only_number() {
		assertEquals(Arrays.asList("1"), FizzBuzzWhizz.count(1));
		assertEquals(Arrays.asList("1", "2"), FizzBuzzWhizz.count(2));
	}

	@Test
	public void one_fizz() {
		assertEquals(Arrays.asList("1", "2", "Fizz"), FizzBuzzWhizz.count(3));
	}

	@Test
	public void one_buzz() {
		assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz"), FizzBuzzWhizz.count(5));
	}

	@Test
	public void two_fizzs() {
		assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz"), FizzBuzzWhizz.count(6));
	}
}
