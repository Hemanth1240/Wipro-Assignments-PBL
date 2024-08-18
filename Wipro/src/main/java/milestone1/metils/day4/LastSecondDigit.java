package milestone1.metils.day4;
import java.util.Scanner;
public class LastSecondDigit {
	public int lastSecondDigit(int input1) {
		// TODO Auto-generated method stub
		if(input1<0)
			input1*=-1;
		if(input1>=0 && input1<=9)
			return -1;
		return (input1/10)%10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LastSecondDigit lsd=new LastSecondDigit();
		System.out.print("Enter a number: ");
		int input1=sc.nextInt();
		sc.close();
		int flag=lsd.lastSecondDigit(input1);
		if(flag==-1)
			System.out.println("Please don\'t enter single digit number");
		else
			System.out.println("Last Second Digit of "+ input1 +" is "+flag);
	}

	

}
