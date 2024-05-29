package com.example.app;
import com.example.service.impl.AxisBank;

public class Application {

	public static void main(String[] args) {

		AxisBank axisBank = new AxisBank();
		
		String showBankDetails = axisBank.showBankDetails();
		
		System.out.println(showBankDetails);
		
		Double maintainMinimumAccountBalence = axisBank.maintainMinimumAccountBalence();
		System.out.println(maintainMinimumAccountBalence);
		
		
		Boolean checkingTaxEligibiltyAmmount = axisBank.checkingTaxEligibiltyAmmount(maintainMinimumAccountBalence);
		System.out.println(checkingTaxEligibiltyAmmount);
		axisBank.ruleAndRegulation();
	}
}
