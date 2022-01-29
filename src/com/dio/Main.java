package com.dio;

public class Main {

	public static void main(String[] args) {
		Client nelson = new Client();
		nelson.setName("Nelson");
		
		Account cA = new CheckingAcc(nelson);
		Account sA = new SavingsAcc(nelson);

		cA.deposit(100);
		cA.transfer(100, sA);
		
		cA.printStatement();
		sA.printStatement();
	}

}