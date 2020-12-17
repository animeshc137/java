import java.util.Scanner;
class Array6{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int max, a1[]= new int[5],a2[]= new int[7],a3[]= new int[12];
		System.out.println("Enter Elements in array 1:");
		for(int i=0; i<a1.length; i++){
			System.out.print("Enter element number" + (i+1) + " : ");
			a1[i]= in.nextInt();

		}
		System.out.println("Enter Elements in array 2:");
		for(int i=0; i<a2.length; i++){
			System.out.print("Enter element number" + (i+1) + " : ");
			a2[i]= in.nextInt();

		}
		System.out.println("Merged array is :");
		for(int i=0; i<a1.length; i++)
			a3[i]= a1[i];
		for(int i=0; i<a2.length; i++)
			a3[i+ a1.length]= a2[i];
		for(int i=0; i<a3.length; i++)
			System.out.print(a3[i]+ " ");
	}
}