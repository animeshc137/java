/* enter 10 numbers and find the largest number*/
import java.util.*;
import java.lang.Math;
class largest_of_10_number{
	public static void main(String s[]){
		int temp, num,max;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter any 10 numbers: ");
		System.out.println("Enter a Number:");
		num= in.nextInt();
		max=num;
		for(int i=1; i<10; ++i){
			System.out.println("Enter a Number:");
			num= in.nextInt();
			if(num>max)
				max=num;

		}
		System.out.println("Largest number entered is: " + max);

	}
}