package school;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library library = Library.getInstance();

        // Create some test books
        Book book1 = new Book();
        book1.title = "The Great Gatsby";
        book1.author = "F. Scott Fitzgerald";
        book1.publicationYear = 1925;
       
        Book book2 = new Book();
        book2.title = "1984";
        book2.author = "George Orwell";

        // create test magazine
        Magazine mag1 = new Magazine();
        mag1.title = "Time Magazine";
        mag1.issueNumber = 123;

        // test adding items to the library
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(mag1);

        // Test findItemByTitle
        System.out.println(library.findItemByTitle("the great gatsby"));
        System.out.println(library.findItemByTitle("1984"));

	// Test item availability
	library.listAvailableItems();

        // Test with a non-existent title
        System.out.println(library.findItemByTitle("Harry Potter"));

	}

}
