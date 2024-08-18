package milestone1.metils.day4;
import java.util.Scanner;
public class Even {
	public int isEven(int input1) {
		if(input1%2==0)
			return 2;
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Even e=new Even();
		System.out.print("Enter a number");
		int input1=sc.nextInt();
		if(e.isEven(input1)==2)
			System.out.println("True");
		else {
			System.out.println("False");
		}
		sc.close();
	}

}
