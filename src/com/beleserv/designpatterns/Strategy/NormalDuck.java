package com.beleserv.designpatterns.Strategy;

public class NormalDuck extends Duck {

	public NormalDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
}
