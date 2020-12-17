import java.util.Scanner;

class arr{
	public static float Average(int a[]){
		int sum = 0;
		for(int j=0; j<a.length; ++j){
			sum = sum+ a[j];
		}
		return (float)sum/a.length;
	}
}
class Array10{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter 10 elements in the array: ");
		for(int i=0; i<a.length; ++i){
			System.out.println("Enter element " + (i+1) + ": ");
			a[i] = in.nextInt();
		}
		float avg= arr.Average(a);
		System.out.println("Average in the Array is: " + avg);


	}
}