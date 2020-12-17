import java.util.Scanner;
class Library{
	int accession_no;
	String author_name;
	String book_title;
	Library(){
		accession_no=0;
		author_name="nil";
		book_title="nil";
	}
}
class Book extends Library{
	Scanner in = new Scanner(System.in);
	int publication_year;
	String publisher_name;
	double book_cost;
	void getdata(){
		System.out.println("Enter the Book's title: ");
		book_title = in.nextLine();

		System.out.println("Enter the Name of Author: ");
		author_name = in.nextLine();

		System.out.println("Enter the book's cost: ");
		book_cost= in.nextDouble();
		System.out.println("Enter the Accession no.: ");
		accession_no = in.nextInt();
		in.nextLine();
		System.out.println("Enter the publisher name: ");
		publisher_name = in.nextLine();

		System.out.println("Enter the publication year: ");
		publication_year = in.nextInt();

	}
	void display(){
		System.out.println("Book's title: " + book_title);
		System.out.println("Author's name: " + author_name);
		System.out.println("Book's cost: " + book_cost);
		System.out.println("Book's Accession no.: " + accession_no);
		System.out.println("Publisher name: " + publisher_name);
		System.out.println("Publication Year: " + publication_year);
	}
}
class test_library{
	public static void main(String args[]){
		Book b = new Book();
		b.getdata();
		b.display();
	}
}




