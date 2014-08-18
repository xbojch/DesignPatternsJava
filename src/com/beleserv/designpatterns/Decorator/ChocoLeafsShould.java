package com.beleserv.designpatterns.Decorator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ChocoLeafsShould {

	private Dessert vanillaIceCream;

	@Before
	public void init() {
		vanillaIceCream = new VanillaIceCream();
		vanillaIceCream = new ChocoLeafs(vanillaIceCream);
	}

	@Test
	public void decorateDessertDescription() {
		assertEquals("Vanilla Ice Cream, Choco Leafs", vanillaIceCream.getDescription());
	}
	
	@Test
	public void decorateDessertPrice() {
		assertEquals(2.20, vanillaIceCream.cost(), 0.01);
	}

}
