package controller;

import model.Item;

public class ManufacturedTaxCalulate implements TaxCalculate {

	/**
	 * It will calculate tax for Manufactured type item  <br>
	 * Tax is 12.5% of the item cost + 2% of (item cost + 12.5% of item cost)
	 */
	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		double newPrice= price*1.125;
		newPrice*=1.02;
		return newPrice;
	}

}
