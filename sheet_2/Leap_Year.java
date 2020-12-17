import java.util.*;
class Leap_Year{
	public static void main(String s[]){
		System.out.println("Enter a Year :");
		Scanner in = new Scanner(System.in);
		int year= in.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0)
			System.out.println("The year is a leap year");
		else
			System.out.println("The year is not a leap year");

		
		}
	}