/*  1*2 + 3*4 + 5*6...  */
import java.util.*;
class loop18{
	public static void main(String s[]){
		Scanner in= new Scanner(System.in);
		int sum=0,n;
		System.out.println("Enter a Number:");
		n= in.nextInt();
		for(int i=1; i<=n; ++i)
			if(n%2!=0){
				System.out.print(i + "*" + (i+1) + " + ");
				sum=sum+i*(i+1);
			}
		System.out.println("\b\b...Sum= " + sum);
	}
}