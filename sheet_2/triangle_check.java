import java.util.*;
class triangle_check{
	public static void main(String s[]){
		Scanner in = new Scanner(System.in);
		int s1,s2,s3;
		System.out.println("Enter the three sides of the triangle respectively:");
		s1= in.nextInt();
		s2= in.nextInt();
		s3= in.nextInt();
		if(s1==s2 && s2==s3 )
			System.out.println("Equilateral Triangle");
		else if(s1==s2 || s2==s3 || s1==s3)
			System.out.println("Isosceles Triangle");
		else if(((s1*s1 + s2*s2) == (s3*s3))|| ((s2*s2 + s3*s3) == (s1*s1)) || ((s3*s3 + s1*s1) == (s2*s2)))
			System.out.println("Right Angled Triangle");
		else
			System.out.println("Scalen Triangle");

		}
	}