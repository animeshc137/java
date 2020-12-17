/*
				Pattern:

					1111
					2222
					3333
					4444
											*/
class pattern_5{
	public static void main(String s[]){
		for(int i=1; i<=4; ++i){
			for(int j=1; j<=4; ++j)
				System.out.print(i);
			System.out.print("\n");
		}
	}
}