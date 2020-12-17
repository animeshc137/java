/*Sum of n numbers entered by user  */
import java.util.*;
class sum_of_numbers{
	public static void main(String s[]){
		Scanner in= new Scanner(System.in);
		int sum=0,n,num;
		System.out.println("Enter the count of numbers you want to add:");
		n= in.nextInt();
		for(int i=1; i<=n; ++i){
			System.out.println("Enter a Number:");
			num= in.nextInt();
			sum=sum+n;
		}
		System.out.println("Sum of the numbers entered  is: " + sum);
	}
}