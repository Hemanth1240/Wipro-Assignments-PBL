// Write a number to check a number is positive, negative or Zero


package milestone1.javafundamentals.flowControl;
import java.util.Scanner;
public class PostiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		if(input1<0)
			System.out.println(input1 + " is Negative");
		else if(input1 > 0)
			System.out.println(input1 + " is Positive");
		else
			System.out.println(input1 + " is Zero");
		sc.close();
	}

}

// ----------------------- P. Hemanth 21K61A1240