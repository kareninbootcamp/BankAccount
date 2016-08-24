package ssa;



public class Mainline {
	
	
public static void main(String[] args) {
Account checking1 = new Account(100, "");	
Savings moneymakeracct = new Savings();
//System.out.println("The interest rate is: "+ moneymakeracct.getInterestRate());
//System.out.println("this is the next thing I'm going to try and print out " + moneymakeracct.getBalance());
//moneymakeracct.deposit(1000.00);
//moneymakeracct.transferFrom(checking1, 100);
//System.out.println("This is the new balance of my money maker account " + moneymakeracct.getBalance());
//Account moneymaker = new Account();
moneymakeracct.deposit(500);
System.out.println(moneymakeracct.getBalance());
moneymakeracct.CalcDepositInterest(4);
System.out.println(moneymakeracct.getBalance());
//System.out.println("My deposit with interest: " + moneymakeracct.CalcDepositInterest(4));
//moneymakeracct.printDeposit();
//
//
//moneymakeracct.setDescription("My money making account!!");
//System.out.println(moneymakeracct.getDescription());
////create checking1 - default constructor
//
////checking1.id = 10;
////checking1.balance = 1.00;
//int checking1Id = checking1.getId();
//System.out.println(checking1Id);
//checking1.setDescription("Checking 1");
//checking1.withdraw(100.00); // bal 0
//checking1.deposit(500.00); // bal 500
//checking1.deposit(200.00); // bal 700
//checking1.setDescription("Checking 1 Modified");
//checking1.deposit(200.00); // bal 900
//checking1.withdraw(900); // bal 0
//checking1.deposit(1.03); // bal 1.00
////
//// create checking2 - description constructor
//Account checking2 = new Account(200,"Checking 2");
//  //   checking2.id = 20;
//    // checking2.balance = 2.00;
//int checking2Id = checking2.getId();
//checking2.setDescription("Checking 1");
//checking2.withdraw(100.00); // bal 0
//checking2.deposit(500.00); // bal 500
//checking2.deposit(200.00); // bal 700
//checking2.setDescription("Checking 1 Modified");
//checking2.deposit(200.00); // bal 900
//checking2.withdraw(900.00); // bal 0
//checking2.deposit(2.02); // bal 2.02
////
////// create savings3 - description constructor
//Account savings3 = new Account(300,"Savings 3");
//////      savings3.id = 20;
//////      savings3.balance = 2.00;
////int savings3Id = checking2.getId();
////savings3.setDescription("Checking 1");
////savings3.withdraw(100.00); // bal 0
////savings3.deposit(300.00); // bal 300
////savings3.deposit(200.00); // bal 500
////savings3.setDescription("Checking 1 Modified");
////savings3.deposit(100.00); // bal 600
////savings3.withdraw(600.00); // bal 0
////savings3.deposit(3.01); // bal 3.01
////
////// total should be 6.06;
////System.out.printf("Total all accounts is %.2f\n", checking1.getBalance() + checking2.getBalance() + savings3.getBalance());
////
////System.out.println("Transfer amount all accounts ...");
////checking1.transferFrom(checking2, 1.01);
////checking2.transferFrom(savings3, 1.01);
////savings3.transferFrom(checking1, 1.01);
////
////// total should be 6.06;
////System.out.printf("Total all accounts is %.2f\n", checking1.getBalance() + checking2.getBalance() + savings3.getBalance());
////
//
////package ssa;
//
//
//
////public class Mainline {
//
//	//public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
////checking.id = 100;
////		checking.description = "My personal checking account";
////		checking.balance = 500.00;
//		
//
//		/*Account checking = new Account();
//		
//		System.out.println(checking.getDescription());
//		System.out.println(checking.getId());
//		System.out.println(checking.getBalance());
//		checking.deposit(1000);
//		System.out.println(checking.getBalance());
//		Account savings = new Account();
//		checking.transferFrom(savings, 300.00);
//		System.out.println(checking.getBalance());*/
//		
//
//		
////		System.out.printf("Our new checking ID is " + checking.id + " and the description is " + checking.description + " and the checking beginning balance is  %.2f \n  " , checking.balance);
////		
////		checking.deposit(200.00);
////		
////		System.out.printf("Your checking accout balance after depositing 200.00 is  %.2f \n  " , checking.balance);
////		
////		checking.withdrawal(600.00);
////		
////		System.out.printf("Your checking account balance after withdrawing 600.00 is %.2f \n  " , checking.balance);
////		
////		checking.deposit(100.00);
////		
////		checking.withdrawal(300.00);
////		
////		System.out.printf("Your checking account balance after depositing 100.00 then withdrawing 300.00 is  %.2f \n  " , checking.balance);
////		
////		checking.withdrawal(200.00);
////		
////		System.out.printf("This is the status of the checking account at this point: %.2f \n  " , checking.balance);
////		
////		
////		Account savings = new Account();
////		savings.id = 200;
////		savings.description = "My personal savings account";
////		savings.balance = 1000.00;
////
////		System.out.printf("Our new savings id is " + savings.id + " and the description is " + savings.description + " and the savings beginning balance is %.2f \n  " , savings.balance);
////		
////		savings.withdrawal(750.00);
////		
////		System.out.printf("Savings account details after 750.00 withdrawal: %.2f \n  " , savings.balance);
////		
////		savings.withdrawal(250.00);
////		
////		System.out.printf("Savings account details after 250.00 withdrawal: %.2f \n  " , savings.balance);
////		
////		savings.deposit(200.00);
////		
////		System.out.printf("Savings account details after 200.00 deposit: %.2f \n ", savings.balance);
////		
////		System.out.printf("Checking total %.2f \n " , checking.balance); 
////		System.out.printf("Savings total %.2f \n " , savings.balance); 
////		
////	

}
}
		