// Write a program that  takes 2 characters as a input and print them in alphabetical Order

package milestone1.javafundamentals.flowControl;
import java.util.Scanner;
public class AlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c1 = sc.next().charAt(0), c2 = sc.next().charAt(0);
		if ((int)c1 < (int)c2)
			System.out.println(c1 + ", " + c2);
		else
			System.out.println(c2 + ", " + c1);
		sc.close();
	}

}
