package week1.day2.homeassignments;

public class Library {
	
	public static void main(String[] args) {
		Library obj1=new Library();
        System.out.println(obj1.addBook("Book Name: Selenium Training by TestLeaf"));
        obj1.issueBook();
	}
	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}

}
