/*  print  table from 1 to 10*/
class print_table_1_to_10{
	public static void main(String s[]){
		System.out.println("TABLES OF 1 TO  10 ARE:");
		for(int n=1; n<=10; ++n){
			System.out.println("\nTable of " + n + " is:");
			for(int i=1; i<=10; ++i)
				System.out.println(n + " x " + i + " = " + (n*i));
		}
	}
}