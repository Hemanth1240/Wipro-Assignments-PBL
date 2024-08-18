package milestone1.metils.day6;
import java.util.Scanner;
public class IsPrime {
	public int isPrime(int input1) {
		for(int i=2; i<input1/2; i++) {
			if(input1%2==0)
				return 1;
		}
		return 2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPrime ip = new IsPrime();
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input1 = sc.nextInt(), flag = ip.isPrime(input1);
		if(flag==2) {
			System.out.println(input1+" is Prime number");
		}
		else
			System.out.println(input1+" is not a Prime number");
		sc.close();
	}

}
