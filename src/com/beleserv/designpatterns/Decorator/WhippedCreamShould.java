package com.beleserv.designpatterns.Decorator;

import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class WhippedCreamShould {

	private Dessert vanillaIceCream;

	@Before
	public void init() {
		vanillaIceCream = new VanillaIceCream();
		vanillaIceCream = new WhippedCream(vanillaIceCream);
	}
	
	@Test
	public void decorateDessertDescription() {
		assertEquals("Vanilla Ice Cream, Whipped Cream", vanillaIceCream.getDescription());
	}
	
	@Test
	public void decorateDessertPrice() {
		assertEquals(2.10, vanillaIceCream.cost(), 0.01);
	}

}
