package lv.diana.bookstore;

public class Book {
	private String name;
	private Author author;
	private double price; 
	private int qty;
	
	public Book(String name, Author author, double price, int qty) { // Constructor
		
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
			
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price
				+ ", qty=" + qty + "]";
	} 
	
	
	

}
