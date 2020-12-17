import java.util.Scanner;
class Array1{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int sum=0, arr[]= new int[10];
		float avg;
		System.out.println("Enter 10 numbers:");
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter element number" + (i+1) + " : ");
			arr[i]= in.nextInt();

		}
		for(int i=0; i<arr.length; i++)
			sum = sum + arr[i];
		avg= (float)sum/arr.length;
		System.out.println("Average is: " + avg);
	}
}