package com.beleserv.designpatterns.AbstractFactory;

public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if(type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
		}

		return pizza;
	}
}
