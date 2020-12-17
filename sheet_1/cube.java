import java.util.*;
class cube{
	public static void main(String s[]){
	int a;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a number");
	a= in.nextInt();
	int b= a*a*a;
	System.out.println("Cube of "  + a + " is " + b);
	}
}