package milestone1.metils.day4;
import java.util.Scanner;
public class LastDigit {
	public int lastDigit(int input1) {
		if(input1<0)
			input1*=-1;
		return input1%10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LastDigit ld=new LastDigit();
		System.out.print("Enter a number: ");
		int input1=sc.nextInt();
		System.out.println("Last Digit of "+ input1 + " is "+ld.lastDigit(input1));
		sc.close();
	}

}
