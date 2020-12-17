import java.util.*;
class sum_of_digits{
	public static void main(String s[]){
	int a, ld,sum=0;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a 5 digit number");
	a= in.nextInt();
	for(int i=1; i<=5;++i)
	{
		sum= sum + a%10;
		a=a/10;

	}
	System.out.println("Sum of digits is " + sum);
	}
}