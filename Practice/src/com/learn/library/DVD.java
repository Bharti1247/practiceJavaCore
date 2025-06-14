package com.learn.library;

public class DVD extends LibraryItem {
	private String isbn = "DVD456";
	private String issueNum = "456";
	
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
