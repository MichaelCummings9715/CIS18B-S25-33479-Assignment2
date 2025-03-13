package school;
import java.util.ArrayList;

public class Library {
	
	private static Library instance; // Singleton 
	private ArrayList<Item> collection;
	
	private Library() {
		// private constructor
		this.collection = new ArrayList<Item>();
		
	}

	// access method for singleton pattern
	public static Library getInstance() {
		if (instance == null) {
			synchronized (Library.class) {
				if (instance == null) {
					instance = new Library();
				}
			}
		}
		
		return instance; 
	}
	
	
	public void addItem(Item item) {
		
		this.collection.add(item);
		
	}
	
	public void listAvailableItems() {
		
		if (collection != null) {
			for (Item item : collection) {
				if (item instanceof IBorrowable) { // not all items implement IBorrowed check needed
					if (!((IBorrowable) item).isBorrowed()) { // if book not borrowed
						Book book = (Book) item;
						System.out.println("Book - Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN() + ", Publication Year: " + book.getPublicationYear());
					} 
					
				} else if (item instanceof Magazine) {
					Magazine magazine = (Magazine) item;
					System.out.println("Magazine - Title: " + magazine.getTitle() + ", Issue Number: " + magazine.getIssueNumber() + ", Publication Year: " + magazine.getPublicationYear());
					
				//System.out.println(item); // print if no items
				} else {
					System.out.print("No Items available");
				}
			}
		}
		
	}
	
	public String findItemByTitle(String title) {
		
		if (collection != null && title != null) { // check for collection to avoid exceptions
			for (Item item : collection) { // check each item in collection
				if (item.getTitle() != null && item.getTitle().equalsIgnoreCase(title)) { // if title search is matching to title in collection
					if (item instanceof Book) {
						Book book = (Book) item;
						return "Book - Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN() + ", Publication Year: " + book.getPublicationYear();
					} else if (item instanceof Magazine) {
						Magazine magazine = (Magazine) item;
						return "Magazine - Title: " + magazine.getTitle() + ", Issue Number: " + magazine.getIssueNumber() + ", Publication Year: " + magazine.getPublicationYear();
					}
				}
			}
		}
		return "Item not found. \n";
		
	}
	
	
}
