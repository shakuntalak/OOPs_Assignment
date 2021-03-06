package CollegeLibrary.lib;

public class Book {
	private String isbn;
	private Boolean isRented;
	private String author;
	public static int countBook=0;
	public static int rentedBook=0;
	public Book(String isbn, Boolean isRented, String author) {
		super();
		this.isbn = isbn;
		this.isRented = isRented;
		this.author = author;
		countBook++;
		if(this.isRented)
			rentedBook++;
	}
	public void numberOfBooks()
	{
		System.out.println(countBook);
	}

	public void rentedBooks()
	{
		System.out.println(rentedBook);
	}
	

}
