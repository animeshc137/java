import java.util.*;
class character{
	public static void main(String s[]){
		char c;
		System.out.println("Enter any character");
		Scanner in= new Scanner(System.in);
		c= in.next().charAt(0);
		System.out.println("the character you entered is " + c);
		}
	}