/* enter a number and find the smallest digit*/
import java.util.*;
import java.lang.Math;
class smallest_digit{
	public static void main(String s[]){
		int temp, n,len=0,min;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		n = in.nextInt();
		temp=n;
		while(temp!=0){
				temp= temp/10;
				len++;
		}
			temp=n;
			min= temp%10;
			temp= temp/10;
		for(int i=1;i<5; ++i){
			if((temp%10)<min)
				min=temp%10;
			temp= temp/10;
		}
		System.out.println("Smallest digit is: " + min);

	}
}