import java.util.*;
class steel_grade{
	public static void main(String s[]){
		Scanner in= new Scanner(System.in);
		int hardness, tensile_strength;
		float carbon_content;
		System.out.println("Enter The Hardness of Steel:");
		hardness = in.nextInt();
		System.out.println("Enter The Hardness of Steel:");
		carbon_content = in.nextFloat();
		System.out.println("Enter The Tensile strength of Steel:");
		tensile_strength = in.nextInt();
		if(hardness>=50 && carbon_content<0.7f && tensile_strength>5600)
			System.out.println("Grade is 10");
		else if(hardness>=50 && carbon_content<0.7f)
			System.out.println("Grade is 9");
		else if(carbon_content<0.7f && tensile_strength>5600)
			System.out.println("The Grade is 8");
		else if(hardness>=50 && tensile_strength>5600)
			System.out.println("The Grade is 7");
		else if(hardness>=50 || carbon_content<0.7f || tensile_strength>5600)
			System.out.println("The Grade is 6");
		else
			System.out.println("The Grade is 5");
	}
}