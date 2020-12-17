import java.util.*;
class Gross_Salary1{
	public static void main(String s[]){
	float bsal, gsal, hra=0.0f, da=0.0f;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter basic Salary :");
	bsal= in.nextFloat();
	if(bsal>=3000.0f){
	hra= 0.2f*bsal;
	da= 0.4f*bsal;
	}
	gsal= hra + da + bsal;
	System.out.println("Gross Salary is " + gsal);
	}
}