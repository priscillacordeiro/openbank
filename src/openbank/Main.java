package openbank;

public class Main {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.deposit(50);
		System.out.println("Account 1: " + account1.balance);
		
		account1.withdraw(20);
		System.out.println("Account 1: " + account1.balance);
		
		Account account2 = new Account();
		account2.deposit(1000);
		System.out.println("Account 2: " + account2.balance);
		
		account2.transfer(300, account1);
		System.out.println("Account 1: " + account1.balance);
		System.out.println("Account 2: " + account2.balance);
	}

}
