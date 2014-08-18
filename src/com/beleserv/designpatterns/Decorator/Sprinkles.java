package com.beleserv.designpatterns.Decorator;

public class Sprinkles extends CondimentDecorator {

	Dessert dessert;
	
	public Sprinkles(Dessert dessert) {
		this.dessert = dessert;
	}
	
	@Override
	public String getDescription() {
		return dessert.getDescription() + ", Sprinkles";
	}

	@Override
	public double cost() {
		return 0.10 + dessert.cost();
	}

}
