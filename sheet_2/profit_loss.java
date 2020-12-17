import java.util.*;
class profit_loss{
	public static void main(String s[]){
		Scanner in = new Scanner(System.in);
		float sp, cp, margin;
		System.out.println("Enter the Selling Price:");
		sp= in.nextFloat();
		System.out.println("Enter the Cost Price:");
		cp= in.nextFloat();
		margin= sp-cp;
		if(cp>sp)
			System.out.println("Loss\n" + "loss margin is: " + (-margin));
		else
			System.out.println("Profit\n" + "Profit margin is: " + margin);


		}
	}