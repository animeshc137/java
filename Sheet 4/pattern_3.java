/*
				Pattern:

					****
					 ***
					  **
					   *
											*/
class pattern_3{
	public static void main(String s[]){
		for(int i=1; i<=4; ++i){
			for(int j=1; j<=i-1; ++j)
				System.out.print(" ");
			for(int k=i; k<=4; ++k)
				System.out.print("*");
			System.out.print("\n");
		}
	}
}