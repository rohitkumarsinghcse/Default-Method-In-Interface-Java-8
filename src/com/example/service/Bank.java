package com.example.service;

public interface Bank {

	// All properties of interface is by default public static final
	public static final String BANK_NAME = "Reserve Bank Of India";
	public static final String BANK_IEFC_CODE = "RBI00INDIA";
	public static final String BANK_PERMANENT_LOCATION = "Indira Bhavan New Delhi India 221023";

	public static final Integer MINIMUM_AGE = 18;
	public static final String REGIDENCIAL = "INDIA";

	public static final Double MINIMUM_ACCOUNT_BALENCE = 2000.00;

	// All method is by default public abstract
	String showBankDetails();

	Double maintainMinimumAccountBalence();

	// defult method
	default void ruleAndRegulation() {
		System.out.println("Account Holder Minimum Age : " + MINIMUM_AGE);
		System.out.println("Account Holder Permanent Regidencial Address is : " + REGIDENCIAL);
	}
}
