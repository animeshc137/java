import java.util.Scanner;

class A{
	public static boolean armstrong(int n){
		int  arm=0,len=0,temp;
		temp=n;
		while(temp!=0){
				temp= temp/10;
				len++;
		}
		temp=n;
		for(int i=len-1; i>=0; --i){
			arm = arm + (temp%10)*(temp%10)*(temp%10);
			temp= temp/10;
		}
		if(arm==n)
			return true;
		else
			return false;

	}
};
class P{
	public static boolean prime(int n){

		for(int i=2; i<n; ++i){
			if(n%i==0)
				return false;
		}
		return true;
	}
};
class Array3{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int Prime_count=0,Arm_count=0, arr[]= new int[10];
		System.out.println("Enter 10 numbers:");
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter element number" + (i+1) + " : ");
			arr[i]= in.nextInt();

		}
		for(int i=0; i<arr.length; i++){
			if(A.armstrong(arr[i]))
				Arm_count++;
			if(P.prime(arr[i]))
				Prime_count++;
			}
		System.out.println("Armstrong numbers are: " + Arm_count);
		System.out.println("Prime numbers are: " + Prime_count);
	}
}