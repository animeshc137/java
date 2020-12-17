/*  5 6 8 12 19 30 ...  */
import java.util.*;
class loop19b{
	public static void main(String s[]){
		Scanner in= new Scanner(System.in);
		int x=1,n, y=5;
		System.out.println("Enter a Number:");
		n= in.nextInt();
		for(int i=1; i<=n; ++i){
			System.out.print(y + " ");
			y=y+x;
			x=x+i;
		}
	}
}