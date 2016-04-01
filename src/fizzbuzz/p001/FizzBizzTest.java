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
}