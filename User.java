package com.myspace.book_recommender;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class User implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String nationality;
	private java.util.List<java.lang.String> bookShelf;

	public User() {
	}

	public java.lang.String getNationality() {
		return this.nationality;
	}

	public void setNationality(java.lang.String nationality) {
		this.nationality = nationality;
	}

	public java.util.List<java.lang.String> getBookShelf() {
		return this.bookShelf;
	}

	public void setBookShelf(java.util.List<java.lang.String> bookShelf) {
		this.bookShelf = bookShelf;
	}

	public User(java.lang.String nationality,
			java.util.List<java.lang.String> bookShelf) {
		this.nationality = nationality;
		this.bookShelf = bookShelf;
	}

}
