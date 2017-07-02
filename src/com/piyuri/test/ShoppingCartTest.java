package com.piyuri.test;

import static org.junit.Assert.assertEquals;

import java.awt.CardLayout;

import org.junit.Before;
import org.junit.Test;

import com.piyuri.java.Product;
import com.piyuri.java.ShoppingCart;

public class ShoppingCartTest {
	
	ShoppingCart cart;
	
	@Before
	public void setUp()
	{
		 cart=new ShoppingCart();
	}
	@Test
	public void checkEmptyShoppingCart()
	{
		
		assertEquals(0,cart.getProductCount());
	}
	@Test
	public void addSingleProductTotheCart()
	{
		Product product=new Product("one",1,30.0);
		
		cart.addProduct(product);
		assertEquals(1, cart.getProductCount());
		
	}
	
	@Test
	public void addDifferentProductsToTheCart()
	{
		
	}
	@Test
	public void testAddMultipleQuantityOfAProductAndApplyOfferToCart() {
	
	
		Product product=new Product("offer",2,30.0);
		
		
		assertEquals(3, cart.getProductCount());
		
		
		
	}
}
