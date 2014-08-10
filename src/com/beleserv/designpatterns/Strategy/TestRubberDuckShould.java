package com.beleserv.designpatterns.Strategy;

import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class TestRubberDuckShould {

	Duck duck;
	
	@Before
	public void init() {
		duck = new RubberDuck();
	}
	
	@Test
	public void notFlyWhenRequired() {
		duck.setFlyBehavior(new FlyNoWay());
		assertEquals("No way to fly!", duck.performFly());
	}
	
	@Test
	public void squeakWhenRequired() {
		duck.setQuackBehavior(new Squeak());
		assertEquals("Squeak", duck.performQuack());
	}

}
