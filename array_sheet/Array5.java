import java.util.Scanner;
class Array5{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int max, arr[]= new int[10];
		System.out.println("Enter 10 numbers:");
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter element number" + (i+1) + " : ");
			arr[i]= in.nextInt();

		}
		max = arr[1];
		for(int i=1; i<arr.length; i++)
			if(max<arr[i])
				max =arr[i];
		System.out.println("LArgest element is: " + max);
	}
}