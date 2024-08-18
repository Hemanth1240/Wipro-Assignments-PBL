package milestone1.metils.day6;
import java.util.Scanner;
public class NthFibanocci {

	private int nthFibanocci(int input1) {
		// TODO Auto-generated method stub
		if(input1 == 1)
			return 0;
		if(input1 == 2)
			return 1;
		int n1=0, n2=1, n3=1;
		for(int i=3; i<=input1; i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		return n2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		NthFibanocci nf = new NthFibanocci();
		System.out.print("Enter Value: ");
		int input1 = sc.nextInt();
		sc.close();
		System.out.println(input1 + "th Fibanocci value is "+nf.nthFibanocci(input1));
	}


}
