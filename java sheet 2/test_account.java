import java.util.Scanner;
class Account{
	Scanner in = new Scanner(System.in);
	String name;
	int acc_no;
	String acc_type;
	double balance;
	void compute_interest(){
		double interest=0.04*balance;
		System.out.println("Interest calculated is : " + interest );
		balance= balance + interest;
	}
	void display(){
			System.out.println("Current Balance is: " + balance );
	}
	void accept_deposit(){
		System.out.println("Enter the Customer's Name: ");
		name= in.nextLine();
		System.out.println("Enter the Account Number: ");
		acc_no = in.nextInt();
		System.out.println("Enter the Deposit amount: ");
		balance = balance + in.nextDouble();
		display();
	}
	void withdraw(){
		System.out.println("Enter the Amount you want to withdraw: ");
		double withdrawl = in.nextDouble();
		if(withdrawl>balance){
		System.out.println("Unable to withdraw, the Withdrawl Amount is more than the current balance ");
		display();
		}
		else{
			balance= balance - withdrawl;
			display();
		}
	}
};
class Curr_Acct extends Account{
	void initialise(){
		acc_type = "Current";
		balance= 3000.00;
	}
};
class Sav_Acct extends Account{
	void initialise(){
		acc_type= "Savings";
		balance=5000.00;
	}
};
class test_account{
	public static void main(String args[]){
		Curr_Acct C = new Curr_Acct();
		C.initialise();
		C.accept_deposit();
		C.compute_interest();
		C.withdraw();
		C.display();
		Sav_Acct S = new Sav_Acct();
		S.initialise();
		S.accept_deposit();
		S.compute_interest();
		S.withdraw();
		S.display();

	}
}
