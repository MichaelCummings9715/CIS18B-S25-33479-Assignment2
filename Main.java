package school;

public class Main {

	public static void main(String[] args) {
	   // TODO Auto-generated method stub
		
	   // Create Library
	   Library library = Library.getInstance();
	   // Create an instance of LibraryItemFactory
	   LibraryItemFactory factory = new LibraryItemFactory();
		
		
	   // Create some test books
	   library.addItem(factory.createItem("book", "The great Gatsby", 1925, "F. Scott Fitzgerald"));
	   library.addItem(factory.createItem("book", "Clean Code", 2008, "Robert C. Martin"));

	   // Create test magazine
           library.addItem(factory.createItem("magazine", "Fighters weekly", 2019, "19"));


    
       
           // Test findItemByTitle
           System.out.println(library.findItemByTitle("the great gatsby"));
           System.out.println(library.findItemByTitle("clean code"));

           // Test with a non-existent title
           System.out.println(library.findItemByTitle("Harry Potter"));
        
           // Test item availability
           library.listAvailableItems();


	}

}
