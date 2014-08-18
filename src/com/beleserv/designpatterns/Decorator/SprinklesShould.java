package com.beleserv.designpatterns.Decorator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SprinklesShould {

	private Dessert cheeseCake;

	@Before
	public void init() {
		cheeseCake = new CheeseCake();
		cheeseCake = new Sprinkles(cheeseCake);
	}

	@Test
	public void decorateDessertDescription() {
		assertEquals("Cheese Cake, Sprinkles", cheeseCake.getDescription());
	}
	
	@Test
	public void decorateDessertPrice() {
		assertEquals(2.25, cheeseCake.cost(), 0.01);
	}

}
