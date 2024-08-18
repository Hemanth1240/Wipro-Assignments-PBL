//Write a program to add last digits of 2 numbers

package milestone1.javafundamentals.flowControl;
import java.util.Scanner;
public class CompareLastDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt(), input2 = sc.nextInt();
		if(input1%10 == input2%10)
			System.out.println("Last digits of " + input1 + " and " + input2 + " are Same");
		else
			System.out.println("Last digits of " + input1 + " and " + input2 + " are not Same");
		sc.close();
	}

}

//------------------- P. Hemanth 21K61A1240
