import java.util.*;
class avg_marks{
	public static void main(String s[]){
	int s1,s2,s3,s4,s5, sum=0;
	float avg;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Marks of 5 Subjects");
	s1= in.nextInt();
	s2= in.nextInt();
	s3= in.nextInt();
	s4= in.nextInt();
	s5= in.nextInt();
	sum= s1+s2+s3+s4+s5;
	avg= sum/5.0f;
	System.out.println("average is " +avg);
	}
}