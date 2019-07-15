    
package com.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
        account.deposit("checking", 750);
        account.withdraw("savings", 125);
		account.deposit("savings", 5000);
		account.withdraw("savings", 250);
		account.getBalances();

	}

}