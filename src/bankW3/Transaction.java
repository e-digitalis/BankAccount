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

import java.util.Date;

public abstract class Transaction {

	private Date timeStamp;
	private int id;
	private double amount;
	
	private static int transactionIdGenerator = 0;
	
	public Transaction(double amount){
		timeStamp = new Date();
		id = transactionIdGenerator++;
		this.amount = amount;
	}
	
	abstract public void printTransaction();

	@Override
	public String toString() {
		return timeStamp + "[ id=" + id + "] amount=" + amount + "]";
	}
		
		
	
}
