package milestone1.oops.overriding;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle("Circle");
		c.draw();
		c.erase();
		Triangle t = new Triangle("Triangle");
		t.draw();
		t.erase();
		Square s = new Square("Square");
		s.draw();
		s.erase();
	}

}
