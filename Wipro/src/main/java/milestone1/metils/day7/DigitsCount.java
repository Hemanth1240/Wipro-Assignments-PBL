package milestone1.metils.day7;
import java.util.Scanner;
public class DigitsCount {
	public int digitsCount(int input1) {
		int count=0;
		while(input1>0) {
			count++;
			input1/=10;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DigitsCount dc = new DigitsCount();
		System.out.print("Enter input value: ");
		int input1 = sc.nextInt();
		System.out.println("Number of digits in " + input1 + " is "+dc.digitsCount(input1));
		sc.close();
	}

}
