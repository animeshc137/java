import java.util.*;
class triangle_validity2{
	public static void main(String s[]){
		Scanner in = new Scanner(System.in);
		int s1,s2,s3;
		System.out.println("Enter the three angles of the triangle respectively:");
		s1= in.nextInt();
		s2= in.nextInt();
		s3= in.nextInt();
		if((s1+s2)>s3 || (s2+s3)>s1 || (s1+s3)>s2)
			System.out.println("Valid Triangle");
		else
			System.out.println("Invalid Triangle");


		}
	}