import java.util.Scanner;
class CharCount{
	static void frequency(String s){
		int i;
		char ch[] = s.toCharArray();
		for(i=0;i<ch.length;++i);
		System.out.println("No. of character in the string is: " + i);
	}
}
class test_CharCount{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String t= in.nextLine();
		CharCount.frequency(t);
	}
}