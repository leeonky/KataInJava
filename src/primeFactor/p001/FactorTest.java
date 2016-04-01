package primeFactor.p001;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class FactorTest {

	@Test
	public void _1_has_no_factors() {
		assertEquals(Arrays.asList(), Factor.factorsOf(1));
	}

	@Test
	public void _2_has_only_factor_2() {
		assertEquals(Arrays.asList(2), Factor.factorsOf(2));
	}

	@Test
	public void has_two_foctors_2() {
		assertEquals(Arrays.asList(2, 2), Factor.factorsOf(4));
	}
}
