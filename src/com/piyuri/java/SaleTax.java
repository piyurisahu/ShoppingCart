package com.piyuri.java;

 abstract class SaleTax {
	 
	public double calculateTaxOnImportedItem(double price)
	{
		return price+=price*10/100;
		
	}
	public abstract double calculateTax();

}
