/*
				Pattern:

					1234
					1234
					1234
					1234
											*/
class pattern_6{
	public static void main(String s[]){
		for(int i=1; i<=4; ++i){
			for(int j=1; j<=4; ++j)
				System.out.print(j);
			System.out.print("\n");
		}
	}
}