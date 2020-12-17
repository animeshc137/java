import java.util.*;
class char_check{
	public static void main(String s[]){
		char c;
		System.out.println("Enter any character");
		Scanner in= new Scanner(System.in);
		c= in.next().charAt(0);
		if(c>='A' && c<='Z')
			System.out.println("The character is an Uppercase alphabet");
		else if(c>='a' && c<='z')
			System.out.println("The character is an lowercase alphabet");
		else if(c>='0' && c<='9')
			System.out.println("The character is a Number");
		else
			System.out.println("The character is a Special Character");
	}
}