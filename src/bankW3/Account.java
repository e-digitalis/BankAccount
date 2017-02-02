/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankW3;

/**
 *
 * @author User
 */

public class Account {
	private String owner;
	private double balance;
	private int accountNo;
	
	static int numberOfAccounts = 0;
	
	private Transaction[] transactionList;
	private int nTransactions;
	
	public Account(String o){
		owner = o;
		balance = 0;
		numberOfAccounts++;
		accountNo = numberOfAccounts;
		transactionList = new Transaction[1000];
		nTransactions = 0;
		transactionList[nTransactions] = new TransactionCreate();
		nTransactions++;
	}
	
	public void deposit (int amount){
		balance += amount;		
	}

	public void withdraw (int amount){
		balance -= amount;		
	}
	
	public void transterTo (int amount, Account to){
		balance -= amount;
		to.balance += amount;	
	}

	
	public void printAll(){
		System.out.println(accountNo + "/" + owner + ": " + balance);
		
	}
	
	
}

