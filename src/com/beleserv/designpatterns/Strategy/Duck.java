package com.beleserv.designpatterns.Strategy;

public abstract class Duck {

	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public String performQuack() {
		return quackBehavior.quack();
	}

	public String performFly() {
		return flyBehavior.fly();
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

}
