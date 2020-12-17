/* 1 2 3 1 2 3 1 2 3...  */
import java.util.*;
class loop19c{
	public static void main(String s[]){
		Scanner in= new Scanner(System.in);
		int n;
		System.out.println("Enter a Number:");
		n= in.nextInt();
		for(int i=1; i<=n; ++i){
			for(int j=1; j<=3; ++j)
				System.out.print(j + " ");

		}
	}
}