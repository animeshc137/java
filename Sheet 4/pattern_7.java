/*
				Pattern:

					1010
					0101
					1010
					0101
											*/
class pattern_7{
	public static void main(String s[]){
		int k=1;
		for(int i=1; i<=4; ++i){

			for(int j=1; j<=4; ++j){
				System.out.print(k%2);
				k++;
		}
			System.out.print("\n");
			k=k+3;
		}
	}
}