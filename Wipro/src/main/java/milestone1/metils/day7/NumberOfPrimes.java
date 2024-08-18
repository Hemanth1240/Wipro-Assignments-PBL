package milestone1.metils.day7;
import java.util.Scanner;
public class NumberOfPrimes {
	public int numberOfPrimes(int input1, int input2) {
		int count=0;
		for(int i = input1; i <= input2; i++) {
			int nof=0;
			for(int j=2; j<i/2; j++) {
				if(i%j == 0) {
					nof=1;
					break;
				}
			}
			if(nof == 0)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfPrimes nop = new NumberOfPrimes();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range: ");
		int input1=sc.nextInt();
		int input2 = sc.nextInt();
		System.out.println("Number of primes in b/w "+input1+" and "+input2+" is "+nop.numberOfPrimes(input1, input2));
		sc.close();
	}

}
