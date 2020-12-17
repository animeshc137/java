import java.util.*;
class first_by_last{
	public static void main(String s[]){
	int a, last, first, result;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a 5 digit number");
	a= in.nextInt();
	first= (a/10000)%10;
	last= a%10;

	result= first/last;
	System.out.println("result is " + result);
	}
}

