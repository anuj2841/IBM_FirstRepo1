package com.anuj.java8.feature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Product {
	int id;
	String name;
	double price;

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

public class FirstLemdaExpression {
	public static void main(String args[]) {
		
		Product p1=new Product(101,"Product1",60.00);
		Product p2=new Product(102,"Product2",30.00);
		Product p3=new Product(103,"Product3",50.00);
		Product p4=new Product(104,"Product4",50.00);
		Product p5=new Product(105,"Product5",80.00);
		List<Product>list=new ArrayList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		/*
		 * list.forEach((p)->{ if(p.getId()>102) { System.out.println(p.getName()); }
		 * });
		 */
		
	Product min=list.stream().min(Comparator.comparingInt(Product::getId)).get();
	System.out.println("min:"+min.getId());
	
	}
}
