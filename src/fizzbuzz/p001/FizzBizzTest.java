package fizzbuzz.p001;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class FizzBizzTest {

	@Test
	public void _1_is_1() {
		assertEquals(Arrays.asList("1"), FizzBizz.count(1, 1));
	}

	@Test
	public void two_numbers() {
		assertEquals(Arrays.asList("1", "2"), FizzBizz.count(1, 2));
	}

	@Test
	public void has_times_3() {
		assertEquals(Arrays.asList("Fizz"), FizzBizz.count(3, 3));
		assertEquals(Arrays.asList("1", "2", "Fizz"), FizzBizz.count(1, 3));
		assertEquals(Arrays.asList("1", "2", "Fizz", "4"), FizzBizz.count(1, 4));
	}
}
