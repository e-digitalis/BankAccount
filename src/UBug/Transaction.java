/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UBug;

/**
 *
 * @author User
 */

import java.util.Date;

public abstract class Transaction {
	private Date timeStamp;
	private int id;
	private int amount;
	
	private static int transactionIdGenerator = 0;

	public Transaction(int amount){
		timeStamp = new Date();
		id = transactionIdGenerator++;
		this.amount = amount;
	}
		
	abstract public void printTransaction();

	@Override
	public String toString() {
		return timeStamp + " ["+ id + "] "+ amount;
	}
}

