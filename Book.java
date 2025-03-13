package school;

class Book extends Item implements IBorrowable {
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
	
	public void setISBN(String isbn) {
		ISBN = isbn;
	}
	
	// getter methods
	public String getAuthor() {
		
		return author;
		
	}
	
	public String getISBN() {
		
		return ISBN;
		
	}
	
	public void borrowItem(String borrower) {
		
		if (borrower == "") {
	
			this.borrower = borrower;
			
		} else {
			
			System.out.print("This book is already borrowed");
		}
		    
	}
	
	public void returnItem() {
		
		borrower = "";
		
	}
	
	public boolean isBorrowed() {
		
		if (borrower != null && borrower.length() > 0) {
			
			return true;
			
		} else {
			
			return false;
		}
		
	}

}
