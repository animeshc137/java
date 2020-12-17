import java.util.*;
class triangle_validity{
	public static void main(String s[]){
		Scanner in = new Scanner(System.in);
		float a1,a2,a3;
		System.out.println("Enter the three angles of the triangle respectively:");
		a1= in.nextFloat();
		a2= in.nextFloat();
		a3= in.nextFloat();
		if((a1+a2+a3)==180.0f)
			System.out.println("Valid Triangle");
		else
			System.out.println("Invalid Triangle");


		}
	}