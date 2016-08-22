package ssa;



public class Mainline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account checking = new Account();
		checking.id = 100;
		checking.description = "My personal checking account";
		checking.balance = 500.00;
				
		
		System.out.printf("Our new checking ID is " + checking.id + " and the description is " + checking.description + " and the checking beginning balance is  %.2f \n  " , checking.balance);
		
		checking.deposit(200.00);
		
		System.out.printf("Your checking accout balance after depositing 200.00 is  %.2f \n  " , checking.balance);
		
		checking.withdrawal(600.00);
		
		System.out.printf("Your checking account balance after withdrawing 600.00 is %.2f \n  " , checking.balance);
		
		checking.deposit(100.00);
		
		checking.withdrawal(300.00);
		
		System.out.printf("Your checking account balance after depositing 100.00 then withdrawing 300.00 is  %.2f \n  " , checking.balance);
		
		checking.withdrawal(200.00);
		
		System.out.printf("This is the status of the checking account at this point: %.2f \n  " , checking.balance);
		
		
		Account savings = new Account();
		savings.id = 200;
		savings.description = "My personal savings account";
		savings.balance = 1000.00;

		System.out.printf("Our new savings id is " + savings.id + " and the description is " + savings.description + " and the savings beginning balance is %.2f \n  " , savings.balance);
		
		savings.withdrawal(750.00);
		
		System.out.printf("Savings account details after 750.00 withdrawal: %.2f \n  " , savings.balance);
		
		savings.withdrawal(250.00);
		
		System.out.printf("Savings account details after 250.00 withdrawal: %.2f \n  " , savings.balance);
		
		savings.deposit(200.00);
		
		System.out.printf("Savings account details after 200.00 deposit: %.2f \n ", savings.balance);
		
		System.out.printf("Checking total %.2f \n " , checking.balance); 
		System.out.printf("Savings total %.2f \n " , savings.balance); 
		
		
		
		
	}

}
