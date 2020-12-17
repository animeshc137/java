import java.util.Scanner;

class arr{
	public static int[] Sort(int a[]){

		for(int i=0; i<a.length; ++i){
			for(int j=0; j<a.length-i-1; ++j){
				if(a[j]<a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
};
class Array9{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter 10 elements in the array: ");
		for(int i=0; i<a.length; ++i){
			System.out.println("Enter element " + (i+1) + ": ");
			a[i] = in.nextInt();
		}
		a = arr.Sort(a);
		System.out.println("Sorted Array is: ");
		for(int i=0; i<a.length; ++i){
			System.out.print(a[i] + " ");
		}

	}
}