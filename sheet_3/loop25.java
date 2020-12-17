/*a raised to the power b  */
import java.util.*;
class loop25{
	public static void main(String s[]){
		Scanner in= new Scanner(System.in);
		int a,b, res=1;
		System.out.println("Enter The base ");
		a= in.nextInt();
		System.out.println("Enter The power");
		b= in.nextInt();
		for(int i=1; i<=b; ++i){
			res= a*res;
		}
		System.out.println(a + "^" + b + " is " + res);
	}
}