import java.util.*;
class third_last_digit{
	public static void main(String s[]){
	int a, tld;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a number");
	a= in.nextInt();
	tld= (a/100)%10;
	System.out.println("Third last digit of "  + a + " is " + tld);
	}
}