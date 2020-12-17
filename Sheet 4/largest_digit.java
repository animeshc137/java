/* enter a number and find the largest digit*/
import java.util.*;
import java.lang.Math;
class largest_digit{
	public static void main(String s[]){
		int temp, n,len=0,max;
		boolean condition=false;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		n = in.nextInt();
		temp=n;
		while(temp!=0){
				temp= temp/10;
				len++;
		}
			temp=n;
			max= temp%10;
			temp= temp/10;
		for(int i=2;i<=5; ++i){
			if((temp%10)>max)
				max=temp%10;
			temp= temp/10;
		}
		System.out.println("Largest digit is: " + max);

	}
}