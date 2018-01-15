package service.implement;

import service.TaxCalculate;

/**
 * It calculate the tax for manufactured type
 * 
 * @author nishantgarg
 */
public class ManufacturedTaxCalculate implements TaxCalculate {

	/**
	 * It will calculate tax for Manufactured type item <br>
	 * Tax is 12.5% of the item cost + 2% of (item cost + 12.5% of item cost)
	 */
	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		double newPrice = price * 1.125;
		newPrice *= 1.02;
		System.out.println(newPrice);
		newPrice = price*0.125;
		newPrice+=.02*price+0.02*newPrice;
		
		return newPrice;
	}

}
