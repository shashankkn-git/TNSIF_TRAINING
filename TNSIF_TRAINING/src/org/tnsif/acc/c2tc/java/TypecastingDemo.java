package org.tnsif.acc.c2tc.java;

public class TypecastingDemo {
	public static void main(String[] args) {
		double pricePerItem=99.30;
		int quality =3;
		double totalPrice=quality*pricePerItem;
		double discount=10.33;
		int roundedDiscount=(int)discount;
		double finalAmount=totalPrice-roundedDiscount;
		System.out.println("online shopping summary");
		System.out.println("items bought:"+quality);
		System.out.println("price per item :"+pricePerItem);
		System.out.println("final amount to pay after discount: "+ finalAmount);
	}
}
