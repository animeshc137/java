import java.util.Scanner;
class prime{
	static int[] primeNumber(int n1,int n2){
		int k=0, a[] = new int[n2-n1];
		for (int n=n1; n<=n2; ++n){
				boolean c= true;
				for(int i=2; i<n; ++i){
					if(n%i==0){
						c=false;
						break;
					}
				}
				if(c){
					a[k]=n;
					++k;

				}
		}
		return a;
	}
}
class test_prime{
	public static void main(String args[]){
		int a,b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the range of the integers: ");
		a= in.nextInt();
		b= in.nextInt();
		//int arr[] = new int[b-a];
		System.out.println("prime numbers between " + a + " and " + b + " are:");
		int arr[]= prime.primeNumber(a,b);
		for(int i=0; i<arr.length;++i){
			if(arr[i]==0)
				break;
			System.out.print(arr[i] + " ");
		}
	}
}
