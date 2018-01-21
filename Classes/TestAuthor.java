public class TestAuthor{
	public static void main(String[] args) {
		//create instance of class

		Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
		System.out.println(anAuthor);   // call toString()
		anAuthor.setEmail("paul@nowhere.com");
		System.out.println(anAuthor);

		System.out.println("The author's name is: " + anAuthor.getName() + "\n his email is: "
			 + anAuthor.getEmail() + "\n and his gender is " + anAuthor.getGender() );
	}
}