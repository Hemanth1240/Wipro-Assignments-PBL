// Write a program to check given input is even or odd

package milestone1.javafundamentals.flowControl;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		if(input1%2 == 0)
			System.out.println(input1 + " is even");
		else
			System.out.println(input1 + " is odd");
		sc.close();
	}
	

}


// ------------------- P. Hemanth 21K61A1240