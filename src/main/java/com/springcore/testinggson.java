package com.springcore;

import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import com.google.gson.Gson;

public class testinggson {
	public static void main(String args[]) throws Exception {
		Gson j = new Gson();
		URL url=new URL("https://api.openweathermap.org/data/2.5/weather?q=varanasi&appid=4a1f8a61b74546825af1e0be106e797b&units=metric");
			URLConnection connection=	url.openConnection();
		Scanner scanner=new Scanner(connection.getInputStream());
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
			
		}
		
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
