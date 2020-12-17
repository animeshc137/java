/* enter a number and print its table*/
import java.util.*;
import java.lang.Math;
class print_table{
	public static void main(String s[]){
		int  n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		n = in.nextInt();
		System.out.println("Table of " + n + "is:" );
		for(int i=1; i<=10; ++i)
			System.out.println(n + " x " + i + " = " + (n*i));
	}
}