/*
				Pattern:

					  AAAAA
					  BBBB
					  CCC
					  DD
					  E
											*/
class pattern_10{
	public static void main(String s[]){
		int i=0;
		for(char c= 'A'; c<='E'; c++){
			i++;
			for(int k=i; k<=5; ++k)
				System.out.print(c);
			System.out.print("\n");


		}
	}
}