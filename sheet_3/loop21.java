/*leap year between 1950 to 2018 */
import java.util.*;
class loop21{
	public static void main(String s[]){
		System.out.println("leap year between 1950 to 2018 are:");
		for ( int i = 1950; i <= 2018 ; i ++){
			if(i%4==0 && i%100!=0 || i%400==0)
				System.out.println(i);

		}

	}
}