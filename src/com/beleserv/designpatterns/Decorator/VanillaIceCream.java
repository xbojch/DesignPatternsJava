package com.beleserv.designpatterns.Decorator;

public class VanillaIceCream extends Dessert {

	public VanillaIceCream() {
		description = "Vanilla Ice Cream";
	}
	
	@Override
	public double cost() {
		return 1.90;
	}

}
