package example.object_array.exercise1;

public class Instructor {
    public long id;
	public String name;
	public String title;
	public String department;
	public Book[] books;
	
	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public Instructor(long id, String name, String title, String department, Book[] books) {
		this(id,name,title,department);
		this.books = books;
	}
	
	public Instructor(long id, String name, String title, String department) {
		this(id,name,title);
		this.department = department;
	}
	
	public Instructor(long id, String name, String title) {
		this(id,name);
		this.title = title;
	}
	
	public Instructor(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getMostRecentBookTitle() {
		// your code
		/*Book[] books = this.getBooks();
		int len = books.length;
		return books[len-1].getTitle();*/
		//actual code
		return books[books.length-1].getTitle();
		
	}
	
	public Book updateBook(int index, String title) {
		// your code
		Book[] books = this.getBooks();
		String oldTitle = books[index].getTitle();
		//OR
		Book oldBook = new Book(books[index].getTitle());
		
		//
		books[index].setTitle(title);
		return new Book(oldTitle);//OR return oldBook;
	}
	
	public Book updateBook(int index, Book book) {
		// your code
		Book[] books = this.getBooks();
		String oldTitle = books[index].getTitle();
		//OR
		 Book oldBook = books[index];
		//
		books[index] = book;
		return new Book(oldTitle); // or  return oldBook

	}
	
	public static void main(String[] args) {
		Book book1 = new Book("Java for Beginners");
        Book book2 = new Book("Scala for Beginners");
        Book book3 = new Book("Effective Python");
		
		Instructor instructor = new Instructor(101, "John", "Assistant Professor", "Computer Science", new Book[]{book1, book2, book3});
		System.out.println(instructor.getMostRecentBookTitle());
		System.out.println("old book title: " + instructor.updateBook(1, "Effective C#").getTitle());
				
		Book book4 = new Book("Introduction to Data Mining");
		System.out.println("old book title: " + instructor.updateBook(1, book4).getTitle());
	}
}