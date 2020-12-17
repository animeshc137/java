import java.util.*;
class rect_ar_pm{
	public static void main(String s[]){
	float ar, pm, l, b;

	Scanner in = new Scanner(System.in);
	System.out.println("Enter Length of Rectangle");
	l= in.nextFloat();
	System.out.println("Enter Breadth of Rectangle");
	b= in.nextFloat();
	ar= l*b;
	pm= 2.0f*(l+b);
	System.out.println("Area is " + ar + " perimeter is " + pm );
	}
}