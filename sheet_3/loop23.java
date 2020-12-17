/*Sum of 10 numbers entered by user  */
import java.util.*;
class loop23{
	public static void main(String s[]){
		Scanner in= new Scanner(System.in);
		int sum=0,n;
		for(int i=1; i<=10; ++i){
			System.out.println("Enter a Number:");
			n= in.nextInt();
			sum=sum+n;
		}
		System.out.println("Sum of the numbers entered  is: " + sum);
	}
}