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
}
