package milestone1.metils.day8;
import java.util.Scanner;
public class OddDigitSum {
	public int oddDigitSum(int input1) {
		int sum=0;
		while(input1>0) {
			if((input1%10)%2 == 1)
				sum+=input1%10;
			input1/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		OddDigitSum ods = new OddDigitSum();
		System.out.print("Enter number: ");
		int input1 = sc.nextInt();
		sc.close();
		System.out.println("Sum of odd digits in " + input1 + " is " + ods.oddDigitSum(input1));
	}

}
