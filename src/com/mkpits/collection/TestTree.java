package com.mkpits.collection;

public class TestTree {

	public static void main(String[] args) {

		Example15_Tree drinks = new Example15_Tree("Drinks");
		Example15_Tree hot = new Example15_Tree("Hot");
		Example15_Tree cold = new Example15_Tree("Cold");

		Example15_Tree tea = new Example15_Tree("Tea");
		Example15_Tree coffee = new Example15_Tree("Coffee");

		Example15_Tree wine = new Example15_Tree("Wine");
		Example15_Tree beer = new Example15_Tree("Beer");

		drinks.addChild(hot);
		drinks.addChild(cold);

		hot.addChild(tea);
		hot.addChild(coffee);

		cold.addChild(wine);
		cold.addChild(beer);

		System.out.println(drinks.print(0));

	}

}
