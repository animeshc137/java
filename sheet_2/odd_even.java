import java.util.*;
class odd_even{
	public static void main(String s[]){
		System.out.println("Enter a number :");
		Scanner in = new Scanner(System.in);
		int a= in.nextInt();
		if(a%2==0 && a!=0)
			System.out.println("The number is even");
		else if(a%2!=0 && a!=0)
			System.out.println("The number is odd");
		else
			System.out.println("The number is neither even nor odd ");


		}
	}