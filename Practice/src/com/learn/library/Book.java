package com.learn.library;

public class Book extends LibraryItem {
	private String isbn = "BOOK123";
	private String issueNum = "123";
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getIssueNum() {
		return issueNum;
	}
	public void setIssueNum(String issueNum) {
		this.issueNum = issueNum;
	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", issueNum=" + issueNum +
				", itemID=" + super.getItemID() + ", title=" + super.getTitle() + ", author=" + super.getAuthor() + "]";
	}		
	
}
