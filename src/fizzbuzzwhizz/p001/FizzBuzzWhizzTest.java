package fizzbuzzwhizz.p001;

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

	@Test
	public void count_two_fizzs() {
		assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz"), FizzBuzzWhizz.count(6));
	}

	@Test
	public void count_first_whizz() {
		assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz"), FizzBuzzWhizz.count(7));
	}

	@Test
	public void count_two_buzzs() {
		assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz"),
				FizzBuzzWhizz.count(10));
	}

	@Test
	public void number_contains_3() {
		assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz", "11", "Fizz",
				"Fizz"), FizzBuzzWhizz.count(13));
	}

	@Test
	public void count_two_whizzs() {
		assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz", "11", "Fizz",
				"Fizz", "Whizz"), FizzBuzzWhizz.count(14));
	}

	@Test
	public void fizz_and_buzz() {
		assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz", "11", "Fizz",
				"Fizz", "Whizz", "FizzBuzz"), FizzBuzzWhizz.count(15));
	}

	@Test
	public void fizz_and_whizz() {
		assertEquals("FizzWhizz", FizzBuzzWhizz.count(21).get(20));
	}
}
