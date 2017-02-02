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
public class CreationTransaction extends Transaction {

	public CreationTransaction() {
		super(0);
	}
	
	@Override
	public void printTransaction() {
		System.out.println(super.toString() + " created");

	}

}
