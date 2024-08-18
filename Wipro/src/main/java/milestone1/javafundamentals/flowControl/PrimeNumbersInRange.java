package milestone1.javafundamentals.flowControl;
import java.util.Scanner;
public class PrimeNumbersInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, nof=0;
		a= sc.nextInt();
		b=sc.nextInt();
		for(int i=a; i<=b; i++) {
			nof=0;
			for(int j=2; j<=i/2; j++) {
				if(i%j == 0) {
					nof=1;
					break;
				}
			}
			if(nof == 0)
				System.out.print( i + " ");
				
		}
		sc.close();
	}

}

//------------------------------- P. Hemanth 21K61A1240
