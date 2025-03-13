package school;

public class Book extends Item implements IBorrowable {
        String author;
	String ISBN;
	
	private String borrower;
	
	public Book() { // constructor
		author = "";
		ISBN = "";
		borrower = "";
	}
	
	// setters
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	
	
	// getter methods
	public String getAuthor() {
		return author;	
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	
	// methods
	public void borrowItem(String borrower) {
		
		if (this.borrower == null || this.borrower.isEmpty()) {
			this.borrower = borrower;
			System.out.println("\n " + borrower + " has taken the book: " + title + "\n");
			
		} else {
			System.out.println(" \n This book is already borrowed");
		}
		    
	}
	
	public void returnItem() {
		System.out.println("\n " + borrower + " has returned their book! \n");
		borrower = null;
		
	}
	
	public boolean isBorrowed() {
		if (borrower != null && borrower.length() > 0) {
			return true;
		} else {
			return false;
		}
		
	}

}
