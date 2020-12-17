import java.util.Scanner;
class rev{
	static void StrRev(String s){
		char ch[] = s.toCharArray();
		for(int i=0;i<(ch.length/2);++i){
			char temp = ch[i];
			ch[i]=ch[ch.length-i-1];
			ch[ch.length-i-1]=temp;
		}
		String sn = new String(ch);
		System.out.println("reverse string is: " + sn);
	}
}
class test_rev{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String t= in.nextLine();
		rev.StrRev(t);
	}
}