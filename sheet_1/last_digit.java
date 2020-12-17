import java.util.*;
class last_digit{
	public static void main(String s[]){
	int a, ld;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a number");
	a= in.nextInt();
	ld= a%10;
	System.out.println("LAst digit of "  + a + " is " + ld);
	}
}