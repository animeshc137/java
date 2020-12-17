import java.util.*;
class second_last_digit{
	public static void main(String s[]){
	int a, sld;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a number");
	a= in.nextInt();
	sld= (a/10)%10;
	System.out.println("Second Last digit of "  + a + " is " + sld);
	}
}