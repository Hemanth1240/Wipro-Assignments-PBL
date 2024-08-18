package milestone1.metils.day8;
import java.util.Scanner;
public class EvenOrOddDigitSum {
	public int evenOrOddDigitSum(int input1, String input2) {
		int esum=0, osum=0, rem;
        while(input1>0){
            rem=input1%10;
            if(rem%2 == 0)
                esum+=rem;
            else
                osum+=rem;
            input1/=10;
        }
        if(input2.equals("even"))
            return esum;
        return osum;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		EvenOrOddDigitSum edsm = new EvenOrOddDigitSum();
		System.out.print("Enter number: ");
		int input1 = sc.nextInt();
		System.out.print("Enter Even or Odd: ");
		String input2 = sc.next();
		System.out.println("Sum of "+ input2 + " in "+ input1 + " is " + edsm.evenOrOddDigitSum(input1, input2));
		sc.close();
	}

}
