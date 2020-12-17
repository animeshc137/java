import java.util.*;
class loop17{
	public static void main(String s[]){
		Scanner in= new Scanner(System.in);
		long mul=1,n;
		System.out.println("Enter a Number:");
		n= in.nextInt();
		for(int i=1; i<=n; ++i)
			mul=mul*i;
		System.out.println("Product is  " + mul);
	}
}