package com.beleserv.designpatterns.Decorator;

public class WhippedCream extends CondimentDecorator {

	Dessert dessert;
	
	public WhippedCream(Dessert dessert) {
		this.dessert = dessert;
	}
	
	@Override
	public String getDescription() {
		return dessert.getDescription() + ", Whipped Cream";
	}

	@Override
	public double cost() {
		return 0.20 + dessert.cost();
	}

}
