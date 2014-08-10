package com.beleserv.designpatterns.Strategy;

public class FlyWithWings implements FlyBehavior {

	@Override
	public String fly() {
		return "Flying with wings!";
	}

}
