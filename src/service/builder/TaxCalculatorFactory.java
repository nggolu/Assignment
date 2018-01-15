package service.builder;

import service.TaxCalculate;
import service.implement.ImportedTaxCalculate;
import service.implement.ManufacturedTaxCalculate;
import service.implement.RawTaxCalculate;

/**
 * it will assign the type of tax
 * 
 * @author nishantgarg
 */
public class TaxCalculatorFactory {
	
	private static final RawTaxCalculate raw = new RawTaxCalculate();
	private static final ManufacturedTaxCalculate manufacture = new ManufacturedTaxCalculate();
	private static final ImportedTaxCalculate imported = new ImportedTaxCalculate();
	/**
	 * @param type
	 *            {@link String}
	 * 
	 * @return {@link TaxCalculate}
	 */
	public TaxCalculate assigntax(String type) {
		TaxCalculate taxCalculate = null;
		if (type.equals("raw")) {
			taxCalculate =raw; 
		} else if (type.equals("manufactured")) {
			taxCalculate = manufacture;
		} else if (type.equals("imported")) {
			taxCalculate = imported;
		}
		return taxCalculate;
	}

}