package myhomeassignement;

public class Library {
	
	public String addBook(String bookTitle) //method with parameter.
	{
		System.out.println("Book added Successfully.");
		return bookTitle;
	}
	
	public void issueBook() //method without parameter.
	{
		System.out.println("Book issued sucessfully.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lb = new Library(); //creating object or instance for the library class.
		lb.addBook("My Book"); // calling the methods using the object or instance.
		lb.issueBook(); //         "
		
	}

}
