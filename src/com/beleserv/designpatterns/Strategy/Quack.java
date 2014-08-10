package com.beleserv.designpatterns.Strategy;

public class Quack implements QuackBehavior {

	@Override
	public String quack() {
		return "Quack";
	}

}
