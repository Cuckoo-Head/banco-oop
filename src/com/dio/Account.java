package com.dio;

public abstract class Account implements AccountInterface {
	
	private static final int DEFAULT_AGENCY = 1;
	private static int NUMBER = 1;

	protected int agency;
	protected int number;
	protected double balance;
	protected Client client;

	public Account(Client client) {
		this.agency = Account.DEFAULT_AGENCY;
		this.number = NUMBER++;
		this.client = client;
	}

	@Override
	public void withdraw(double value) {
		balance -= value;
	}

	@Override
	public void deposit(double value) {
		balance += value;
	}

	@Override
	public void transfer(double value, AccountInterface destAcc) {
		this.withdraw(value);
		destAcc.deposit(value);
	}

	public int getAgency() {
		return agency;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	protected void printInfo() {
		System.out.println(String.format("Holder: %s", this.client.getName()));
		System.out.println(String.format("Agency: %d", this.agency));
		System.out.println(String.format("Number: %d", this.number));
		System.out.println(String.format("Balance: %.2f", this.balance));
	}
}