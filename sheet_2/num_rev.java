import java.util.*;
class num_rev{
	public static void main(String s[]){
		int num,n,temp,rev=0;
		System.out.println("Enter a 5 digit number :");
		Scanner in = new Scanner(System.in);
		num= in.nextInt();
		temp=num;
		n= temp%10;
		rev= rev + n*10000;
		temp=temp/10;
		n= temp%10;
		rev= rev + n*1000;
		temp=temp/10;
		n= temp%10;
		rev= rev + n*100;
		temp=temp/10;
		n= temp%10;
		rev= rev + n*10;
		temp=temp/10;
		n= temp%10;
		rev= rev + n;
		System.out.println("reverse of" + num + " is " + rev);
		if(num==rev)
				System.out.println("The number is a palindrome");
		else
				System.out.println("The number is not a palindrome");


		}
	}