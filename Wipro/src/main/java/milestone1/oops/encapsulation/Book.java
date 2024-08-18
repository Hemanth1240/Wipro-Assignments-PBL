package milestone1.oops.encapsulation;

public class Book {
	String name;

	Author author;
	double price;
	int qtyStock;
	public Book(String name, Author author, double price, int qtyStock) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyStock = qtyStock;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyStock() {
		return qtyStock;
	}
	public void setQtyStock(int qtyStock) {
		this.qtyStock = qtyStock;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", qtyStock=" + qtyStock + "]";
	}
	
}
