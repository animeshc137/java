import java.util.*;
class loop8{
	public static void main(String s[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number (upper limit):");
		int n1 = in.nextInt();
		System.out.println("Enter a number (lower limit):");
		int n2 = in.nextInt();
		for(int i=n1; i>=n2; --i)
			System.out.println(i);
	}
}