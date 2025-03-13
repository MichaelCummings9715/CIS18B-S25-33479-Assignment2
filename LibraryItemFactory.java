package school;

public abstract class LibraryItemFactory {
	
	public Item createItem(String type, String title, int publicationYear, String extraData) {
		if (type.equalsIgnoreCase("book")) {
			Book book = new Book();
			book.setAuthor(extraData);
			book.setTitle(title);
			book.setPublicationYear(publicationYear);
			return book;
			
		}
		else if (type.equalsIgnoreCase("magazine")) {
			Magazine magazine = new Magazine();
			magazine.setTitle(title);
			magazine.setPublicationYear(publicationYear);
			magazine.setIsssueNumber(Integer.parseInt(extraData));
			return magazine;
		}
		
		
		return null;
		
	}

}
