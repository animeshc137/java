// take 10 in an array and search for a number entered by the user
import java.util.Scanner;
class Array4{
	public static void main(String args[]){
		boolean c=false;
		Scanner in = new Scanner(System.in);
		int item, a[] = new int[10];
		System.out.println("ENter 10 numbers:");
		for(int i=0; i<a.length; ++i){
			System.out.print("Enter element"+ (i+1)+ ": ");
			a[i]= in.nextInt();
		}
		System.out.println("Enter the number you want to search:");
		item = in.nextInt();
		for(int i=0; i<a.length; ++i){
		if(item== a[i])
			c= true;
		}
		if(c)
			System.out.println("Yes it is present");
		else
			System.out.println("No, it is not present");
	}
}
