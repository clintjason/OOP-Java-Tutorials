public class TestBook{
	public static void main(String[] args) {
		/*
		 * //instantiate Author class
		Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
		//instantiate the Book class
		Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
		//anonimoous instantiation of Author class
		Book anotherBook = new Book("Good morning Holy Spirit", new Author("Benny Hinn","benny@ministries.com",'m'), 29.95, 88000);
		System.out.println(aBook);
		System.out.println(anotherBook);
		//displaying name and email of book author
		System.out.println("Book " + anotherBook.getName()+ "\n author " 
			+ anotherBook.getAuthor().getName() + "\n email " + anotherBook.getAuthor().getEmail());
		//Testing new methods introduced to get book author's details
		System.out.println("Book " + aBook.getName() + "\n Author " + aBook.getAuthorName()
			+ "\n Email " + aBook.getAuthorEmail() + "\n Gender " + aBook.getAuthorGender());
			
			*/
		//Declare and allocate an array of Authors
		Author[] authors = new Author[5];
		authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
		authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
		// Declare and allocate a Book instance
		Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
		javaDummy.addAuthor(new Author("Clint Jason", "jason@somewhere.com", 'm'));
		javaDummy.addAuthor(new Author("Paul Yannick", "Paul@nowhere.com", 'm'));
		System.out.println(javaDummy);  // toString()
		javaDummy.printAuthors(authors);
	}
}
