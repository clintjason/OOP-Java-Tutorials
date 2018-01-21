public class Author{	//saved as Author.java
	//Datafield
	private String name;
	private String email;
	private char gender;
	//constructor method
	public Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	//A public method that returns the author name
	public String getName(){
		return name;
	}
	//A public method that returns the author's email
	public String getEmail(){
		return email;
	}
	//A public method to set the email of the an author
	public void setEmail(String email){
		this.email = email;
	}
	//A public method that returns the author's gender
	public char getGender(){
		return gender;
	}
	//A public mehtod to give the author's description
	public String toString(){
		return name + " (" + gender + ")" + " at " + email;
	}
}