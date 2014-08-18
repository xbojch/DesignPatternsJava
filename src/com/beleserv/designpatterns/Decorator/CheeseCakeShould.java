package com.beleserv.designpatterns.Decorator;

import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class CheeseCakeShould {

	private CheeseCake cheeseCake;

	@Before
	public void init() {
		cheeseCake = new CheeseCake();
	}
	
	@Test
	public void defineADescription() {
		assertEquals("Cheese Cake", cheeseCake.getDescription());
	}
	
	@Test
	public void defineAPrice() {
		assertEquals(2.15, cheeseCake.cost(), 0.01);
	}

}
