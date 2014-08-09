package com.beleserv.designpatterns;

import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class SampleTest {
	
	private SimpleCalculator simpleCalculator;

	@Before
	public void init() {
		simpleCalculator = new SimpleCalculator();
	}
	
	@Test
	public void testSimpleAddition() {
		assertEquals(5, simpleCalculator.add(2,3));
		assertEquals(4, simpleCalculator.add(1,3));
		assertEquals(-3, simpleCalculator.add(-6,3));
		assertEquals(0, simpleCalculator.add(-2,2));
	}

}
