package school;

public interface IBorrowable {
	
	void borrowItem(String borrower);
	
	void returnItem();
	
	public boolean isBorrowed();
	

}
