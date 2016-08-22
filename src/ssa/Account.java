package ssa;

public class Account {
	
	int id;
	String description;
	double balance;
	
	
	
	double deposit(double aDeposit){
		balance = balance + aDeposit;
		return balance;
	}
	
	double withdrawal(double aWithdrawal){
		if(aWithdrawal > balance) {
			System.out.println("Insufficient Funds!");
		} else 
			
			balance = balance - aWithdrawal;
			return balance;
			
		}
	
	
		
	}



