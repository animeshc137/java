/*
				Pattern:

					   ABCDEFGFEDCBA
					   ABCDEF FEDCBA
					   ABCDE   EDCBA
					   ABCD     DCBA
					   ABC       CBA
					   AB         BA
					   A           A
											*/
class pattern_11{
	public static void main(String s[]){
		System.out.println("ABCDEFGFEDCBA");
		for(int i=1; i<=6; ++i){
			char c='A',d=(char)('F'-(i-1));
			for(int j=6; j>=i; --j){
				System.out.print(c++);
			}
			for(int k=i; k<=(i*2-1);k=k+1){

				System.out.print("  ");
		}

			for(int j=6; j>=i; --j){
			System.out.print(d--);
	     	}
			System.out.print("\n");

		}
	}
}