import java.util.*;
class loop15{
	public static void main(String s[]){
		Scanner in= new Scanner(System.in);
		int sum=0,n;
		System.out.println("Enter a Number:");
		n= in.nextInt();
		for(int i=1; i<=n; ++i)
			sum=sum+i;
		System.out.println("Sum= " + sum);
	}
}