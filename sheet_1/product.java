import java.util.*;
class product{
	public static void main(String s[]){
	int a, b;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter value of a");
	a= in.nextInt();
	System.out.println("Enter value of b");
	b= in.nextInt();
	int c= a*b;
	System.out.println("product of "  + a + " and " + b + " is " + c);
	}
}