/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author User
 */

import java.util.Date;

public abstract class Transactions {

	private Date timeStamp;
	private int id;
	private double amount;
	
	


	@Override
	public String toString() {
		return timeStamp + "[" + id + "] " + amount + " ";
	}
	
}

