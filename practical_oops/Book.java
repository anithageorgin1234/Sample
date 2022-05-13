package com.grearlearning.practical;

public class Book {

	
	String name;
	Author author;
	double price;
	int qty=0;
	Book(String name,Author author,double price)
	{
		this.name=name;
		this.author=author;
		this.price=price;
	}
	Book(String name,Author author,double price,int qty)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}
	
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty + "]";
	}
	public static void main(String[] args) {
		// Construct an author instance
		Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
		System.out.println(ahTeck);  // Author's toString()

		Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);  // Test Book's Constructor
		System.out.println(dummyBook);  // Test Book's toString()
 
	 
		// Use an anonymous instance of Author to construct a Book instance
		Book anotherBook = new Book("more Java", 
		      new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
		System.out.println(anotherBook);  // toString()

	}

}
