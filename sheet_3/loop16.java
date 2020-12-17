import java.util.*;
class loop16{
	public static void main(String s[]){
		Scanner in= new Scanner(System.in);
		int mul=1;
		for(int i=1; i<=10; ++i)
			mul=mul*i;
		System.out.println("product is" + mul);
	}
}