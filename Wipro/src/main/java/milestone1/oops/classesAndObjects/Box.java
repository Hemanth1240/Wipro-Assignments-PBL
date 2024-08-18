/*
 * Create a class Box that uses a parameterized constructor to initialize the dimensions 
 * of a box.
 * The dimensions of the Box are width, height, depth. 
 * The class should have a method that can return the volume of the box. 
 * Create an object of the Box class and test the functionalities.
 */

package milestone1.oops.classesAndObjects;

public class Box {
	double width, height, depth;
	public Box(String arr[]) {
		this.width = Integer.valueOf(arr[0]);
		this.height = Integer.valueOf(arr[1]);
		this.depth = Integer.valueOf(arr[2]);
	}
	public double volume() {
		return width*height*depth;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box(args);
		System.out.println("Volume of Box is " + b.volume());
	}

}


//------------------------------ P. Hemanth 21K61A1240