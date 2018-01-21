import java.util.ArrayList;
public class Book{
	// Instance variables
	private String name;
	private Author[] authors;
	private int numAuthors = 5;
	private double price;
	private int qtyInStock = 0;
	
	//A public overloaded constructor method with 3 arguements
	public Book(String name, Author[] authors, double price){
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	//A public overloaded constructor method with 4 arguements
	public Book(String name, Author[] authors, double price, int qtyInStock){
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	//A public method to get the name of this book
	public String getName(){
		return name;
	}
	//A public method to get the price of this book
	public double getPrice(){
		return price;
	}
	//A public method to set the price of this book
	public void setPrice( double price){
		this.price = price;
	}
	// A public method to get the qty of this book in stock
	public int getQtyInStock(){
		return qtyInStock;
	}
	//A public method to set the qty of this book in stock
	public void setQtyInStock(int qtyInStock){
		this.qtyInStock = qtyInStock;
	}
	//A public method to describe this book
	public String toString(){
	ArrayList<String> auth = new ArrayList<String>();
		auth = getAuthorNames();
		return name + " by " + auth;
	}
	//A public method to get the author
	public Author[] getAuthor(){
		return authors;
	}
	//A public method to get the book author name
	public ArrayList<String> getAuthorNames(){
		ArrayList<String> str = new ArrayList<String>();
		for(int i=0;i<authors.length;i++){
			str.add(authors[i].getName());
		}
		return str;
	}
/*
	//A public method to get the book author email
	public String getAuthorEmail(){
		return authors.getEmail();
	}

	//A public method to get the book author gender
	public char getAuthorGender(){
		return author.getGender();
	}
*/
	public void printAuthors(Author[] author){
	ArrayList<String> auth = new ArrayList<String>();
	System.out.print("The author(s) of the book is/are: ");
		     auth = getAuthorNames();
		     for(String name: auth)
		     	System.out.print(name + ", ");
	System.out.println();
	}
	
	public void addAuthor(Author author) {
      authors[numAuthors] = author;
      ++numAuthors;
   }
}
