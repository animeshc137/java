import java.util.*;
import java.lang.Math;
class point_lying{

	public static void main(String s[]){
		Scanner in = new Scanner(System.in);
		double x1,y1, radius,x2, y2,distance;
		System.out.println("Enter the coordinate of center:(x,y)");
		x1= in.nextDouble();
		y1= in.nextDouble();
		System.out.println("Enter the Radius of the circle:");
		radius= in.nextDouble();
		System.out.println("Enter the coordinate of the point:(x,y)");
		x2= in.nextDouble();
		y2= in.nextDouble();
		distance= Math.sqrt(((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
		if(distance> radius)
			System.out.println("Point lies outside the circle");
		else if(distance == radius)
			System.out.println("Point lies on the circle");
		else
			System.out.println("Point lies inside the circle");
	}
}