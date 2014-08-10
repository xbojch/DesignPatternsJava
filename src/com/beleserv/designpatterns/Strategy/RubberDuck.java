package com.beleserv.designpatterns.Strategy;

public class RubberDuck extends Duck {

	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}

}
