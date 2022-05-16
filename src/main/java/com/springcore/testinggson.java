package com.springcore;

import java.io.PrintStream;

import com.google.gson.Gson;

public class testinggson {
	public static void main(String args[]) {
		Gson j = new Gson();
		int a[] = new int[] { 1, 6, 9, 4, 5 };
		Book b = new Book();
		b.setName("Shiv");
		b.setPrice(100);
		//System.out.println(j.toJson(b));
String output=j.toJson(b);

		 System.out.println(output);
		b= j.fromJson(output, Book.class);
System.out.println(b);
	}
}

class Book {
	private String name;
	private int price;

	@Override
	public String toString() {
		return "Book [getName()=" + getName() + ", getPrice()=" + getPrice() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
