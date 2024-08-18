package milestone1.metils.day4;

import java.util.Scanner;
public class SumOfLastDigits {
	public int sumofLastDigits(int input1, int input2) {
		if(input1<0)
			input1*=-1;
		if(input2<0)
			input2*=-1;
		return (input1%10)+(input2%10);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		SumOfLastDigits sld=new SumOfLastDigits();
		int input1, input2;
		System.out.print("Enter 2 numbers: ");
		input1=sc.nextInt();
		input2=sc.nextInt();
		sc.close();
		System.out.println("Sum of last digits of "+ input1+ " and "+input2+" is "+sld.sumofLastDigits(input1, input2));
	}
}
