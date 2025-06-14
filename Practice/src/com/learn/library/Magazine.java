package com.learn.library;

public class Magazine extends LibraryItem {
	private String isbn = "M345";
	private String issueNum = "345";
	
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
	
	

}
