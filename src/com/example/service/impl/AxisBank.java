package com.example.service.impl;

import com.example.service.Bank;
import com.example.service.IndialGovermentRules;

public class AxisBank implements Bank, IndialGovermentRules {

	@Override
	public String showBankDetails() {

		String details = "Name of the Bank is : Axis Bank" + "\n" + "IEFC Code of the Bank is : Axis001" + "\n"
				+ "Location of the Bank is : Varanasi";
		return details;
	}

	@Override
	public Double maintainMinimumAccountBalence() {
		ruleAndRegulation();
		return MINIMUM_ACCOUNT_BALENCE;
	}

	@Override
	public Boolean checkingTaxEligibiltyAmmount(Double ammount) {
		if (ammount >= IndialGovermentRules.MINIMUM_BALENCE_FOR_TAX_ELIGIBILITY) {
			return true;
		}
		return false;
	}

	@Override
	public void ruleAndRegulation() {
		 Bank.super.ruleAndRegulation();
		 IndialGovermentRules.super.ruleAndRegulation();
	}
	
	
	

}
