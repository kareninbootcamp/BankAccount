package ssa;

public class Savings extends Account { //Savings inherits from Account
	
	double interestRate = 0.015;
	
	
	public double getInterestRate() {
	//interestRate /= 100.00; //convert interest rate from 0.015 to 1.5
	return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	//method that calculates amount of interest using the interest rate
			//then the method deposits that amount into the savings account
	public void CalcDepositInterest(int months){
				
	  double CalcDepostitInterest = (interestRate/12) * months*getBalance();
	  
	  this.deposit(CalcDepostitInterest);						
				
 }
	public void  printDeposit(){
		super.print();
		
		System.out.println("My deposit interest "+ CalcDepositInterest(4));
		
	}
}
