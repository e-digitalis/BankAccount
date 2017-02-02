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


public class TransferToTransaction extends Transaction {

private String fromName;
	
	public  TransferToTransaction(int amount, String from) {
		super(amount);
		fromName = from;
	}
	@Override
	public void printTransaction() {
		System.out.println(super.toString() + " transfer from " + fromName);

	}
}