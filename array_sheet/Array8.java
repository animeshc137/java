import java.util.Scanner;

class arr{
	public static int Largest(int a[]){
		int temp;
		temp= a[0];
		for(int j=1; j<a.length; ++j){
			System.out.print(a[j] + " ");
			if(temp<a[j])
				temp= a[j];
		}
		return temp;
	}
}
class Array8{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter 10 elements in the array: ");
		for(int i=0; i<a.length; ++i){
			System.out.println("Enter element " + (i+1) + ": ");
			a[i] = in.nextInt();
		}
		int max= arr.Largest(a);
		System.out.println("Largest in the Array is: " + max);


	}
}