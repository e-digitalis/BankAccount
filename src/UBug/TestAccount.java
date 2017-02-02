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

public class TestAccount {

public static void main(String[] args) {
		
		Account a1 = new Account("Ulf");
		Account a2 = new Account("Anna");
		
		a1.deposit(200);
		a1.withdraw(170);
		
		a2.deposit(300);
		a2.transferTo(100, a1);
		
		a1.printAll();
		a2.printAll();
		

	}
}


