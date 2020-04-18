package com.headfirst.factory.pizzastore;

public class PepperoniPizza extends Pizza {
	
	public PepperoniPizza() {
		name = "Pepperoni Pizza";
		dough = "Thin Crust";
		sauce = "Marinara Sauce";
		
		toppings.add("Pepperoni");
		toppings.add("Sliced Onion");
		toppings.add("Grated Parmesan Cheese");
	}
}
