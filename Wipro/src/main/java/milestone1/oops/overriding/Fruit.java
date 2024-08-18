package milestone1.oops.overriding;

public class Fruit {
	String name, taste, size;
	public Fruit(String name, String taste, String size) {
		super();
		this.name = name;
		this.taste = taste;
		this.size = size;
	}
	public void eat() {
		System.out.println("Eating " + name + ", it tastes " + taste + ".");
	}
}
