/*
 * Create a new class called Calculator with the following methods: 
1. A static method called powerInt(int num1,int num2)
This method should return num1 to the power num2.
2. A static method called powerDouble(double num1,int num2).
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power.
 */

package milestone1.oops.classesAndObjects;
import java.lang.Math;
public class Calculator {
	public int powerInt(int num1, int num2) {
		return (int)Math.pow(num1, num2);
	}
	public double powerDouble(double num1, int num2) {
		return Math.pow(num1, num2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		System.out.println("Integer Power value " + c.powerInt(2, 4));
		System.out.println("Double Power value " + c.powerDouble(2.2, 4));
	}

}


//-------------------------------- P. Hemanth 21K61A1240