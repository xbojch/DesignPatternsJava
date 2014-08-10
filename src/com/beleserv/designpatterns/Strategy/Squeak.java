package com.beleserv.designpatterns.Strategy;

public class Squeak implements QuackBehavior {

	@Override
	public String quack() {
		return "Squeak";
	}

}
