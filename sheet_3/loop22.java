/*leap year between 1950 to 2018 and its count */
import java.util.*;
class loop22{
	public static void main(String s[]){
		int c=0;
		System.out.println("leap year between 1950 to 2018 are:");
		for ( int i = 1950; i <= 2018 ; i ++){
			if(i%4==0 && i%100!=0 || i%400==0)
				System.out.println(i);
				c++;
		}
		System.out.println("No. of Leap Years from 1950 to 2018 is: " + c);
	}
}