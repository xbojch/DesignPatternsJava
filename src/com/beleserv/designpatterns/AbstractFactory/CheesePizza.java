package com.beleserv.designpatterns.AbstractFactory;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
		setName("Cheese Pizza");
		this.prepare();
	}

	@Override
	void prepare() {

		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
		pepperoni = ingredientFactory.createPepperoni();
		clams = ingredientFactory.createClams();
	}
	
}
