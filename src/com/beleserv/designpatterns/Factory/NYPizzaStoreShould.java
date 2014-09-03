package com.beleserv.designpatterns.Factory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NYPizzaStoreShould {

	PizzaStore pizzaStore;
	private Pizza pizza;
	
	@Before
	public void setUp() throws Exception {
		pizzaStore = new NYPizzaStore();
		pizza = pizzaStore.createPizza("cheese");
	}

	@Test
	public void shouldBeACheesePizza() {
		assertEquals("Cheese Pizza", pizza.getName());
	}
	
	@Test
	public void shouldHaveThinCrustDough() {
		assertEquals("Thin Crust Dough", pizza.getDough());
	}
	
	@Test
	public void shouldHaveMarinaraSauce() {
		assertEquals("Marinara Sauce", pizza.getSauce());
	}
	
	@Test
	public void shouldHaveReggianoCheese() {
		assertEquals("Reggiano Cheese", pizza.getCheese());
	}
	
	@Test
	public void shouldHaveGarlicOnionMushroomRedPepper() {
		assertEquals("Garlic, Onion, Mushroom, Red Pepper", pizza.getVeggies());
	}
	
	@Test
	public void shouldHaveSlicedPepperoni() {
		assertEquals("Sliced Pepperoni", pizza.getPepperoni());
	}
	
	@Test
	public void shouldHaveFreshClams() {
		assertEquals("Fresh Clams", pizza.getClams());
	}
}
