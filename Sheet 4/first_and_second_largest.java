/* enter n numbers and find the largest number*/
import java.util.*;
import java.lang.Math;
class first_and_second_largest{
	public static void main(String s[]){
		int temp, num,max1,max2;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter 10 numbers:");
		System.out.println("Enter a Number:");
		num= in.nextInt();
		max1=num;
		System.out.println("Enter a Number:");
		num= in.nextInt();
		if(num>max1){
		max2=max1;
		max1=num;
		}
		else
		max2=num;
		for(int i=3; i<=10; ++i){
			System.out.println("Enter a Number:");
			num= in.nextInt();
			if(num>max1){
				max2=max1;
				max1=num;
			}
			else if(num>max2)
				max2=num;
		}
		System.out.println("Largest number entered is: " + max1);
		System.out.println("Second Largest number entered is: " + max2);
	}
}