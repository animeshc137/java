/*series 0 1 1 2 3 5 8 13 21...n    fibbonachi series  */
import java.util.*;
class series20_2{
	public static void main(String args[]){
		Scanner in= new Scanner(System.in);
		int n,sum=0,f=0,sec=1;
		System.out.println("Enter the count :");
		n= in.nextInt();
		System.out.print("0 " + sec + " ");
		for(int i=1; i<=n-2; ++i){
			sum=f+sec;
			System.out.print(sum + " ");
			f=sec;
			sec=sum;
		}
		System.out.println(" ");

	}
}