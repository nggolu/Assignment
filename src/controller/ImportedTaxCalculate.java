package controller;

import model.Item;

public class  ImportedTaxCalculate implements TaxCalculate{

	/**
	 * It will calculate tax for imported type item  <br>
	 * Tax is 10% import duty on item cost + a surcharge.<br>
	 * (surcharge is: Rs. 5 if the final cost after applying tax & import duty is up to Rs. 100,<br>
	 * Rs. 10 if the cost exceeds 100 and up to 200 and 5% of the final cost if it exceeds 200).
	 */
	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		double newPrice=price*1.1;
		if(newPrice<=100)newPrice+=5.0;
		else if(newPrice<=200)newPrice+=10;
		else newPrice+=20;
		
		return newPrice;
	}

}
