import java.util.Scanner;
class Array2{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int e_count=0, o_count=0, arr[]= new int[10];
		System.out.println("Enter 10 numbers:");
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter element number" + (i+1) + " : ");
			arr[i]= in.nextInt();

		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0)
				e_count++;
			else
				o_count++;
		}
		System.out.println("No. of even elements is " + e_count);
		System.out.println("No. of odd elements is " + o_count);
	}
}