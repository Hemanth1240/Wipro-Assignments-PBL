package milestone1.oops.overriding;

public class Shape {
	String shape;

	public Shape(String shape) {
		super();
		this.shape = shape;
	}
	
	public void draw() {
		System.out.println("Drawing " + shape);
	}
	public void erase() {
		System.out.println("Erasing " + shape);
	}
}
