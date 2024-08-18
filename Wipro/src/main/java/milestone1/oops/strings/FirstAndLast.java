/*
 * Write a java program that accepts a string and
 *  returns a new string without the first and last character of the input string.

Example1)
i/p:Suman
o/p:uma
 */
package milestone1.oops.strings;
import java.util.Scanner;
public class FirstAndLast {
	public String firstAndLast(String input1) {
		return input1.substring(1, input1.length()-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FirstAndLast fal = new FirstAndLast();
		System.out.print("Enter Input String: ");
		String input1 = sc.next();
		System.out.println("Resultant Output: " + fal.firstAndLast(input1));
		sc.close();
	}

}
