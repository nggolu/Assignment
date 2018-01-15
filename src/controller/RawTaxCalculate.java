package controller;

import model.Item;

public class RawTaxCalculate implements TaxCalculate {
	/**
	 * It will calculate tax for raw type item  <br>
	 * Tax is 12.5 percent of total price 
	 */
	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		
		return price*1.125;
	}

}
