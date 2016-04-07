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
}
