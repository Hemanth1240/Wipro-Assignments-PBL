package milestone1.metils.day6;
import java.util.Scanner;
public class Factorial {
	public int factorial(int input1) {
		for(int i = input1-1; i>1; i--)
			input1*=i;
		return input1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Factorial f = new Factorial();
		int input1;
		System.out.print("Enter a number: ");
		input1 = sc.nextInt();
		System.out.println("Factorial of " + input1 + " is "+f.factorial(input1));
		sc.close();
	}

}
