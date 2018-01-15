package service.implement;

import service.TaxCalculate;

/**
 * It calculate the tax for imported type
 * 
 * @author nishantgarg
 */
public class ImportedTaxCalculate implements TaxCalculate {

	/**
	 * It will calculate tax for imported type item <br>
	 * Tax is 10% import duty on item cost + a surcharge.<br>
	 * (surcharge is: Rs. 5 if the final cost after applying tax & import duty is up
	 * to Rs. 100,<br>
	 * Rs. 10 if the cost exceeds 100 and up to 200 and 5% of the final cost if it
	 * exceeds 200).
	 */
	@Override
	public double calculate(double price) {
		double newPrice = price * 0.1;
		if (newPrice + price <= 100)
			newPrice += 5.0;
		else if (newPrice + price <= 200)
			newPrice += 10.0;
		else
			newPrice += 20;
		return newPrice;
	}
}
