/*
 *  Write a program to print * in Floyds format (using for and while loop)
 */

package milestone1.javafundamentals.flowControl;
import java.util.Scanner;
public class FloydFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		for(int i=1; i<=input1; i++) {
			for(int j=1; j<=i; j++)
				System.out.print("* ");
			System.out.println();
		
		}
		sc.close();

	}

}


//---------------------------------- P. Hemanth 21K61A1240
