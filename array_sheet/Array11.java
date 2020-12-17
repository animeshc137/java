import java.util.Scanner;

class arr{
	public static int[] Intersection(int a[], int b[]){
		int l=0, inter[] = new int[(a.length + b.length)];
		for(int j=0; j<a.length; ++j){
			inter[j]=a[j];
		}
		for(int j=0; j<b.length; ++j){
			int k;
			for(k=0; k<a.length; k++){
				if(a[k]== b[j])
					break;

			}
			if(k==a.length){
				inter[l+a.length] = b[j];
				l++;
			}

		}
		return inter;
	}
}
class Array11{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int a[] = new int[5], b[] = new int[5],c[];
		System.out.println("Enter 5 elements in the first array: ");
		for(int i=0; i<a.length; ++i){
			System.out.println("Enter element " + (i+1) + ": ");
			a[i] = in.nextInt();
		}
		System.out.println("Enter 5 elements in the Second array: ");
				for(int i=0; i<a.length; ++i){
					System.out.println("Enter element " + (i+1) + ": ");
					b[i] = in.nextInt();
		}
		c= arr.Intersection(a,b);
		System.out.println("Intersectioin of the elements of the two Arrays is: ");
		for(int i=0; i<c.length; ++i)
			System.out.print(c[i]+ " ");

	}
}