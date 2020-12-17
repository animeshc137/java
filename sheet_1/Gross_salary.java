import java.util.*;
class Gross_salary{
	public static void main(String s[]){
	float bsal, gsal, hra, da;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter basic Salary :");
	bsal= in.nextFloat();
	hra= 0.4f*bsal;
	da= 0.2f*bsal;
	gsal= hra + da + bsal;
	System.out.println("Gross Salary is " + gsal);
	}
}