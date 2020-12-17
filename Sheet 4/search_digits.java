/* enter a number and a digit and check for the presence of that digit in the number*/
import java.util.*;
import java.lang.Math;
class search_digits{
	public static void main(String s[]){
		int temp, n,len=0,digit;
		boolean condition=false;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		n = in.nextInt();
		System.out.println("Enter the digit you want to search");
		digit = in.nextInt();
		temp=n;
		while(temp!=0){
				temp= temp/10;
				len++;
		}
			temp=n;
		for(int i=len-1; i>=0; --i){
			if((temp%10)==digit)
					condition=true;
			temp= temp/10;
		}
		if(condition)
			System.out.println("Digit is Present in the number ");
		else
			System.out.println("Digit is Not Present in the number ");

	}
}