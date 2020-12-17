/* enter any number(int) and check wether it is an Armstrong number*/
import java.util.*;
import java.lang.Math;
class Armstrong{
	public static void main(String s[]){
		int  n, arm=0,len=0,temp;
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
			arm = arm + (temp%10)*(temp%10)*(temp%10);
			temp= temp/10;
		}
		if(arm==n)
			System.out.println("Armstrong number ");
		else
			System.out.println("Not an Armstrong number ");
		}

}