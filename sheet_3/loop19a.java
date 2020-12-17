/*  1 2 4 7 11 16...  */
import java.util.*;
class loop19a{
	public static void main(String s[]){
		Scanner in= new Scanner(System.in);
		int x=1,n;
		System.out.println("Enter a Number:");
		n= in.nextInt();
		for(int i=1; i<=n; ++i){
			System.out.print(x + " ");
			x=x+i;
		}
	}
}