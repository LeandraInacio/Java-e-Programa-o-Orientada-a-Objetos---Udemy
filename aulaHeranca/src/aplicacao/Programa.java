package aplicacao;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Programa {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);

		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 1000.0, 0.0);

		// UPCASTING

		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Maria", 0.0, 0.01);

		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;

		/* BusinessAccount acc5 = (BusinessAccount)acc3; (o tipo SavingAccount não pode
		 ser convertido para BusinessAccount.
		 é necessário aplicar o instanceof para não ocorrer erro.*/

		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.00);
			System.out.println("Loan concluido!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update concluído! ");
		}
		
		bacc.withdraw(200.00);
		System.out.println(bacc.getBalance());
	}
}
