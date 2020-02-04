
package JavaBankApplication;

//************************************************************************
//Account.java	  Template created on15.9.2016
//- The class for Account objects
//************************************************************************
public class Account {

	private String accountNumber;
	private double balance;

	public Account(String accountNumber) {

		this.accountNumber = accountNumber;
		balance = 0.00;
	}

	public void deposit(double amount) {

		balance = balance + amount;

	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public boolean withdraw(double amount) {
		if (amount > 0) {
			balance = balance - amount;
			return true;
		} else {
			return false;
		}

	}

}
//End