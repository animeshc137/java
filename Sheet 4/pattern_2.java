/*
				Pattern:

					*
					**
					***
					****
											*/
class pattern_2{
	public static void main(String s[]){
		for(int i=1; i<=4; ++i){
			for(int j=1; j<=i; ++j)
				System.out.print("*");
			System.out.print("\n");
		}
	}
}