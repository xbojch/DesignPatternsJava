package com.beleserv.designpatterns.Decorator;

import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class VanillaIceCreamShould {

	private Dessert vanillaIceCream;

	@Before
	public void init() {
		vanillaIceCream = new VanillaIceCream();
	}
	
	@Test
	public void defineADescription() {
		assertEquals("Vanilla Ice Cream", vanillaIceCream.getDescription());
	}
	
	@Test
	public void defineAPrice() {
		assertEquals(1.90, vanillaIceCream.cost(), 0.01);
	}
	
	@Test
	public void enableMultiDecoration() {
		vanillaIceCream = new WhippedCream(vanillaIceCream);
		assertEquals("Vanilla Ice Cream, Whipped Cream", vanillaIceCream.getDescription());
		assertEquals(2.10, vanillaIceCream.cost(), 0.01);
		
		vanillaIceCream = new Sprinkles(vanillaIceCream);
		assertEquals("Vanilla Ice Cream, Whipped Cream, Sprinkles", vanillaIceCream.getDescription());
		assertEquals(2.20, vanillaIceCream.cost(), 0.01);
		
		vanillaIceCream = new ChocoLeafs(vanillaIceCream);
		assertEquals("Vanilla Ice Cream, Whipped Cream, Sprinkles, Choco Leafs", vanillaIceCream.getDescription());
		assertEquals(2.50, vanillaIceCream.cost(), 0.01);
	}
	
	@Test
	public void enableDoubleDecoration() {
		vanillaIceCream = new WhippedCream(vanillaIceCream);
		vanillaIceCream = new WhippedCream(vanillaIceCream);
		
		assertEquals("Vanilla Ice Cream, Whipped Cream, Whipped Cream", vanillaIceCream.getDescription());
		assertEquals(2.30, vanillaIceCream.cost(), 0.01);
	}

}
