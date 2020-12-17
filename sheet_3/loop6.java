import java.util.*;
class loop6{
	public static void main(String s[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = in.nextInt();
		for(int i=n; i>=1; --i)
			System.out.println(i);
	}
}