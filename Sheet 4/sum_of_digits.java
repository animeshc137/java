/* enter number of ANY LENGTH (int) And get the reverse of it*/
import java.util.*;
import java.lang.Math;
class sum_of_digits{
	public static void main(String s[]){
		int temp, n, rev=0,len=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		n = in.nextInt();
		temp=n;
		while(temp!=0){
				temp= temp/10;
				len++;
		}
			temp=n;
		for(int i=len-1; i>=0; --i){
			rev = rev + (int)(temp%10*Math.pow(10,i));
			temp= temp/10;
		}
		System.out.println("Reverse of the number is: " + rev);
	}
}