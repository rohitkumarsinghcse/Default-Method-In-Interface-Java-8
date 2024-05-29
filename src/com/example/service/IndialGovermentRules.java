package com.example.service;

public interface IndialGovermentRules {

	public static final Double MINIMUM_BALENCE_FOR_TAX_ELIGIBILITY = 750000.00;
	
	Boolean checkingTaxEligibiltyAmmount(Double ammount);
	
	default void ruleAndRegulation() {
		System.out.println("Tax pay between month end 25 - 30 : ");
		System.out.println("In case if you are not able to pay tax as per time you should pay 20 % of your ammout + tax ");
	}
}
