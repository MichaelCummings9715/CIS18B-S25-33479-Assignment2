package school;

public class Item { // attributes
	String title;
	int publicationYear;
	
	public Item() { // constructor
		title = "";
		publicationYear = 0;
		
	}
	
	
	//setters
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	// getter methods
	public String getTitle() {
		
		return title;
		
	}
	
	public int getPublicationYear() {
		
		return publicationYear;
		
	}
	
	
}
