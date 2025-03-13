package school;

class Magazine extends Item {
	
	// attributes
	int issueNumber;
	
	public Magazine() { // constructor 
		issueNumber = 0;
		
	}
	
	// setter 
	public void setIsssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}
	
	// getter method
	public int getIssueNumber() {
		
		return issueNumber;
		
	}
	

}
