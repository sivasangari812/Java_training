package oops.stageofinheritance;

public class Task1 {	
	static class BankAccount {
		double balance = 10000;
		void deposit(double amount) {
		balance += amount;
		}
		void withdraw(double amount) {
			if(amount <= balance) {
				balance -= amount;
			}else {
				System.out.println("Not enough balance");
			}
				}
		void showBalance() {
			System.out.println("Balance:"+ balance);
		}
	}
	public static void main(String[]args) {
		BankAccount b = new BankAccount();
		b.deposit(2000);
		b.withdraw(1000);
		b.showBalance();
		}
	}
