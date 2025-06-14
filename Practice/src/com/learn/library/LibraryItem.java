package com.learn.library;

public class LibraryItem {
	private String itemID;
	private String title;
	private String author;
	
	void checkout(String itemID) {
		if (this.itemID == itemID) System.out.println("This item is yours now...");
		else System.out.println("This item is not available in library for now.");
	}
	
	void returnItem(String itemID) {
		System.out.println("This item is added back to library.");
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LibraryItem(String itemID, String title, String author) {
		this.itemID = itemID;
		this.title = title;
		this.author = author;
	}

	public LibraryItem() {
		super();
	}
	
	
}
