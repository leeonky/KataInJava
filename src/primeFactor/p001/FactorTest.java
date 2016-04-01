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
	public void several_faoctors_2() {
		assertEquals(Arrays.asList(2), Factor.factorsOf(2));
		assertEquals(Arrays.asList(2, 2), Factor.factorsOf(4));
		assertEquals(Arrays.asList(2, 2, 2), Factor.factorsOf(8));
	}

	@Test
	public void one_fact_3() {
		assertEquals(Arrays.asList(3), Factor.factorsOf(3));
	}

	@Test
	public void two_facts_3() {
		assertEquals(Arrays.asList(3, 3), Factor.factorsOf(9));
	}
}
