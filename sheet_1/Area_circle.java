import java.util.*;
class Area_circle{
	public static void main(String s[]){
	float area,r;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Radius of circle");
	r= in.nextFloat();
	area= 3.14f*r*r;
	System.out.println("Area is " + area);
	}
}