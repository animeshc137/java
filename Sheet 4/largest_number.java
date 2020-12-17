/* enter n numbers and find the largest number*/
import java.util.*;
import java.lang.Math;
class largest_number{
	public static void main(String s[]){
		int temp, num,n,max;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the count of numbers you want to enter:");
		n= in.nextInt();
		System.out.println("Enter a Number:");
		num= in.nextInt();
		max=num;
		for(int i=1; i<n; ++i){
			System.out.println("Enter a Number:");
			num= in.nextInt();
			if(num>max)
				max=num;

		}
		System.out.println("Largest number entered is: " + max);

	}
}