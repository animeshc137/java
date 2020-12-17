import java.util.*;
class positive_negative{
	public static void main(String s[]){
		System.out.println("Enter a number :");
		Scanner in = new Scanner(System.in);
		int a= in.nextInt();
		if(a<0)
			System.out.println("The number is negative");
		else
			System.out.println("The number is positive");

		}
	}