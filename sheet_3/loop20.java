/* 11*2*3*4...n   factorial of n */
import java.util.*;
class loop20{
	public static void main(String s[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = in.nextInt();
		int f = 1 ;
		for ( int i = 1; i <= n ; i ++){
			System.out.print( i + "*");
			f = f * i;
		}
		System.out.println("\b \nfactorial of " + n  + " is " + f );

	}
}