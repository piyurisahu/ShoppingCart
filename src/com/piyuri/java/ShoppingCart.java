package com.piyuri.java;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	enum productName
	{
		 OFFER,
		No_OFFER;
	}
	private  double totalCartValue;
	private  int productCount=0;
	private List<Product> products=new ArrayList<>();

	

	public ShoppingCart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void addProduct(Product product) {
		products.add(new Product(product.getProductName(),product.getCount(),product.getProductPrice()));
		
	}

	public int getProductCount() {
		// TODO Auto-generated method stub
		
		return products.size();
		
	}

	public double getTotalCartValue() {
		// TODO Auto-generated method stub
		double totalValue=0;
	
		
		for(Product product:products)
		{
			totalValue+= product.getProductCount();
		}
		
		return totalValue;
		
	}

	public void setOffer() {
		// TODO Auto-generated method stub
		
		
		if()
		
	}

}
