package milestone1.metils.day8;
import java.util.Scanner;
public class EvenDigitSum {
	public int evenDigitSum(int input1) {
		int sum=0;
        while(input1>0){
            if((input1%10)%2 == 0)
                sum+=input1%10;
            input1/=10;
        }
        return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		EvenDigitSum eds = new EvenDigitSum();
		System.out.print("Enter Number: ");
		int input1 = sc.nextInt();
		System.out.println("Even Digit Sum for "+ input1 + " is "+ eds.evenDigitSum(input1));
		sc.close();
	}

}
