/*
 * Write a Java program to find if the given number is palindrome or not
 */

package milestone1.javafundamentals.flowControl;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt(), num = input1, num2 = 0;
		while(input1 > 0) {
			num2 = (num2*10) + input1%10;
			input1/=10;
		}
		if(num2 == num)
			System.out.println(num + " is palindrome");
		else
			System.out.println(num + " is not a palindrome");
		sc.close();
	}

}
