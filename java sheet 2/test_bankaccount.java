import java.util.Scanner;
class BankAccount{
	private String name;
	private int acc_no;
	private String acc_type;
	private double bal_amt;
	BankAccount(){
		bal_amt=3000.00;
	}
	Scanner in = new Scanner(System.in);
	void getdata(){
		System.out.println("Enter the name: ");
		name = in.nextLine();
		System.out.println("Enter the Account number: ");
		acc_no = in.nextInt();
		System.out.println("Enter the Account type: ");
		acc_type = in.next();
	}
	void deposit(){
		System.out.println("Enter the amount in numbers that you want to deposit: ");
		bal_amt = bal_amt +  in.nextDouble();
		System.out.println("Avaliable balance now is " + bal_amt);
	}
	void withdraw(){
		System.out.println("Enter the amount in numbers that you want to withdraw: ");
		double withdraw_amt = in.nextDouble();
		if(withdraw_amt>bal_amt)
			 System.out.println("Can't withdraw! The amount entered is more than the avaliable balance...");
		else{
			bal_amt = bal_amt - withdraw_amt;
			System.out.println(withdraw_amt + " withdrawn Successfully!");
		}
		System.out.println("Avaliable balance now is " + bal_amt);
	}
	void display(){
		System.out.println("Name: " + name);
		System.out.println("Avaliable balance: " + bal_amt);
	}
};
class test_bankaccount{
		public static void main(String args[]){
			Scanner in = new Scanner(System.in);
			char c='y';
			BankAccount b = new BankAccount();
			System.out.println(".........Welcome.........");
			System.out.println("........Main menu........:");
			System.out.println("1. Enter Data." );
			System.out.println("2. Display Data." );
			System.out.println("3. Withdraw." );
			System.out.println("4. Deposit." );
			byte choice;
			do{
			System.out.println("Enter your choice: ");
			choice= in.nextByte();
			switch(choice)
			{
				case 1: b.getdata();
						break;
				case 2: b.display();
						break;
				case 3: b.withdraw();
						break;
				case 4: b.deposit();
						break;
				default :	System.out.println("Invalid entry!" );
			}
			System.out.println("do you want to do more operations?.....(y/n): " );
			c= in.next().charAt(0);
				}while(c=='y' || c=='Y');
		}
}
