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

public class TransactionCreate extends Transaction {

	public TransactionCreate(){
		super(0.0);
	}
	
	@Override
	public void printTransaction() {

		System.out.println(super.toString());

	}

}

