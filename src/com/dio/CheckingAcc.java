package com.dio;

public class CheckingAcc extends Account {

	public CheckingAcc(Client client) {
		 super(client);
	}

	@Override
	public void printStatement() {
		System.out.println("=== Checking Account's Statement ===");
		super.printInfo();
	}
	
}