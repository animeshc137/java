import java.util.Scanner;
class Array7{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int max, arr[]= new int[10];
		System.out.println("Enter 10 numbers:");
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter element number" + (i+1) + " : ");
			arr[i]= in.nextInt();

		}

		for(int i=0; i<(arr.length/2); i++){
			int temp = arr[i];
			arr[i]= arr[(arr.length-i-1)];
			arr[arr.length-i-1]= temp;
		}
		System.out.println("reversed array is ");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");

	}
}