import java.util.*;
class absolute{
	public static void main(String s[]){
		System.out.println("Enter a number :");
		Scanner in = new Scanner(System.in);
		int a= in.nextInt();
		if(a<0)
			a=a*(-1);

		System.out.println("Absolute value is " + a);
		}
	}