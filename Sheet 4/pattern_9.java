/*
				Pattern:

					   1
					  121
					 12321
					1234321
											*/
class pattern_9{
	public static void main(String s[]){
		for(int i=1; i<=4; ++i){
			for(int k=i; k<=4; ++k)
				System.out.print(" ");
			for(int j=1; j<=i; ++j)
				System.out.print(j);
			for(int j=i-1; j>=1; --j)
				System.out.print(j);




			System.out.print("\n");

		}
	}
}