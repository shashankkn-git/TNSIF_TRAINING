package org.tnsif.acc.c2tc.oops;

public class FoodItem {
	String name;
	double price;
	String category;
	void displayDetails() {
		System.out.println("Name : "+ name);
		System.out.println("price : "+ price);
		System.out.println("category :"+ category);
	}
	public static void main(String[] args) {
		FoodItem fooditem1=new FoodItem();
		fooditem1.name="idli";
		fooditem1.price=60.66;
		fooditem1.category="tiffen";
		fooditem1.displayDetails();
		
		FoodItem fooditem2=new FoodItem();
		fooditem2.name="biriyani";
		fooditem2.price=65.55;
		fooditem2.category="lunch";
		fooditem2.displayDetails();
	}
}
