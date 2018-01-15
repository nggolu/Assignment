
package controller;

import model.Item;
/**
 * It calculate the tax of every type
 * @author nishantgarg
 */
public interface TaxCalculate {
	/** 
	 * @param price - {@link double}
	 * @return tax + price - {@link Double}
	 * 
	 */

	double calculate(double price);

}
