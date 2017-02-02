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
public class TransferFromTransaction extends Transaction {

	private String toName;
	
	public  TransferFromTransaction(int amount, String to) {
		super(amount);
		toName = to;
	}
	@Override
	public void printTransaction() {
		System.out.println(super.toString() + " transfer to " + toName);

	}

}