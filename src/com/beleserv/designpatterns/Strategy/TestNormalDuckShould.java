package com.beleserv.designpatterns.Strategy;

import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class TestNormalDuckShould {

	private Duck duck;

	@Before
	public void init() {
		duck = new NormalDuck();
	}
	
	@Test
	public void quackWhenRequired() {
		duck.setQuackBehavior(new Quack());
		assertEquals("Quack", duck.performQuack());
	}

	@Test
	public void flyWhenRequired() {
		duck.setFlyBehavior(new FlyWithWings());
		assertEquals("Flying with wings!", duck.performFly());
	}
}
