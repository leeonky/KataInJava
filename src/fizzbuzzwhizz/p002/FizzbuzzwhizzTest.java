package fizzbuzzwhizz.p002;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FizzbuzzwhizzTest {

	@Test
	public void only_number() {
		assertEquals(Arrays.asList("1"), FizzBuzzWhizz.count(1));
		assertEquals(Arrays.asList("1", "2"), FizzBuzzWhizz.count(2));
	}

	@Test
	public void fizzs_step_by_3() {
		List<String> result = FizzBuzzWhizz.count(3);
		assertEquals("Fizz", result.get(2));

		result = FizzBuzzWhizz.count(6);
		assertEquals("Fizz", result.get(2));
		assertEquals("Fizz", result.get(5));
	}

	@Test
	public void buzzs_step_by_5() {
		List<String> result = FizzBuzzWhizz.count(5);
		assertEquals("Buzz", result.get(4));

		result = FizzBuzzWhizz.count(10);
		assertEquals("Buzz", result.get(4));
		assertEquals("Buzz", result.get(9));
	}

	@Test
	public void whizzs_step_by_7() {
		List<String> result = FizzBuzzWhizz.count(7);
		assertEquals("Whizz", result.get(6));

		result = FizzBuzzWhizz.count(14);
		assertEquals("Whizz", result.get(6));
		assertEquals("Whizz", result.get(13));
	}

	@Test
	public void fizzbuzz() {
		assertEquals("FizzBuzz", FizzBuzzWhizz.count(15).get(14));
	}

	@Test
	public void fizzwhizz() {
		assertEquals("FizzWhizz", FizzBuzzWhizz.count(21).get(20));
	}

	@Test
	public void buzzwhizz() {
		assertEquals("BuzzWhizz", FizzBuzzWhizz.count(70).get(69));
	}

	@Test
	public void fizzbuzzwhizz() {
		assertEquals("FizzBuzzWhizz", FizzBuzzWhizz.count(3 * 5 * 7).get(3 * 5 * 7 - 1));
	}

	@Test
	public void contains_3() {
		assertEquals("Fizz", FizzBuzzWhizz.count(35).get(34));
	}
}
