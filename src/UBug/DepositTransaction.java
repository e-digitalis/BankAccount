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
public class DepositTransaction extends Transaction {

	public  DepositTransaction(int amount) {
		super(amount);
	}
	
	@Override
	public void printTransaction() {
		System.out.println(super.toString() + " deposited");

	}

}
