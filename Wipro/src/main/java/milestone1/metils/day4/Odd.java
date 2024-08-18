package milestone1.metils.day4;
import java.util.Scanner;
public class Odd {
	public int isOdd(int input1) {
		if((input1&1)==1)
			return 2;
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Odd o=new Odd();
		System.out.print("Enter a number: ");
		int input1=sc.nextInt();
		if(o.isOdd(input1)==2)
			System.out.println("True");
		else {
			System.out.println("False");
		}
		sc.close();
	}
}
