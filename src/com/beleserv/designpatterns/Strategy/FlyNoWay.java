package com.beleserv.designpatterns.Strategy;

public class FlyNoWay implements FlyBehavior {

	@Override
	public String fly() {
		return "No way to fly!";
	}

}
