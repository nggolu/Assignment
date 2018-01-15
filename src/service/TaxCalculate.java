package service;

/**
 * It calculate the tax for every type
 * 
 * @author nishantgarg
 */
public interface TaxCalculate {
	/**
	 * @param price
	 *            - {@link double}
	 * @return tax + price - {@link Double}
	 * 
	 */
	double calculate(double price);
}
