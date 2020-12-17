import java.util.*;
class Pecentage_division{
	public static void main(String s[]){
	int s1,s2,s3,s4,s5, sum=0;
	float per;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Marks of 5 Subjects");
	s1= in.nextInt();
	s2= in.nextInt();
	s3= in.nextInt();
	s4= in.nextInt();
	s5= in.nextInt();
	sum= s1+s2+s3+s4+s5;
	per= sum/5.0f;
	System.out.println("Percentage  is " +per);
	if(per>=60)
		System.out.println("First division");
	else if(per<60 && per>=50)
		System.out.println("Second division");
	else if(per<50 && per>=30)
		System.out.println("Third division");
	else
		System.out.println("You Failed");
	}
}