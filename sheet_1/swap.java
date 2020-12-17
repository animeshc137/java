import java.util.*;
class swap{
	public static void main(String s[]){
	int a,b;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter two number");
	a= in.nextInt();
	b= in.nextInt();
	System.out.println("Before swapping a is "  + a + " and b is " + b);
	b= (a+b) - (a=b);
	System.out.println("After swapping a is "  + a + " and b is " + b);
	}
}