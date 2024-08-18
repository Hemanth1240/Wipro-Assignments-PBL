// Write a program to print the sum of all the digits of a given number.

package milestone1.javafundamentals.flowControl;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt(), sum=0, num=input1;
		while(input1 > 0) {
			sum += (input1%10);
			input1/=10;
		}
		System.out.println("Sum of digits of "+ num + " is "+sum);
		sc.close();
	}

}

//----------------- P. Hemanth 21K61A1240