/* enter number of ANY LENGTH (int) And get the digit count*/
import java.util.*;
import java.lang.Math;
class number_count{
	public static void main(String s[]){
		int n,len=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		n = in.nextInt();
		while(n!=0){
				n= n/10;
				len++;
		}
		System.out.println("Number of digits in the number entered is  " + len);
	}
}