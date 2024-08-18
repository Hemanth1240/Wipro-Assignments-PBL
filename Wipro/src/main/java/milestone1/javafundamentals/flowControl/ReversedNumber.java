/*
 * Write a program to reverse a given number and print
 */

package milestone1.javafundamentals.flowControl;
import java.util.Scanner;
public class ReversedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt(), num = input1, num2=0;
		while(input1 > 0) {
			num2 = (num2*10) + input1%10;
			input1/=10;
		}
		System.out.println("Reversed number of " + num + " is " + num2);
		sc.close();
	}

}

//------------------------ P. Hemanth 21K61A1240
