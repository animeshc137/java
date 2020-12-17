import java.util.Scanner;
class Vehicle{
	private String color, category;
	private float price;
	private int mfd_year;
	Scanner in = new Scanner(System.in);
	Vehicle(){
		this.mfd_year = 2018;
		this.color = "white";
		this.Price = 40000.0f;
		this.category = "sedan";
	}
	getData(){
		System.out.println("Enter Year of manufacturing:");
		mfd_year = in.nextInt();
		System.out.println("Enter Price:");
		price = in.nextFloat();
		System.out.println("Enter Color:");
		color = in.next();
		System.out.println("Enter Category:");
		category = in.next();
	}
	display(){
		System.out.println("manufacturing year: " + mfd_year);
		System.out.println("Price: " + price);
		System.out.println("Color: " + color);
		System.out.println("Category: " + category);
	}
};
class test_vehicle{
	public static void main(String args[]){
		Vehicle v = new Vehicle();
		v.display();
		v.getData();
		v.display();
	}
}