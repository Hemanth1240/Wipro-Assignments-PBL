package milestone1.metils.day7;
import java.util.Scanner;
public class UniqueDigitsCount {
	public int uniqueDigitsCount(int input1) {
		int count1[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int count=0;
		while(input1>0) {
			if(count1[input1%10] == 0) {
				count++;
				count1[input1%10]=1;
			}
			input1/=10;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		UniqueDigitsCount udc = new UniqueDigitsCount();
		int input1;
		System.out.print("Enter Number: ");
		input1 = sc.nextInt();
		System.out.println("Number of unique digits in " + input1 + " is " + udc.uniqueDigitsCount(input1));
		sc.close();
		
	}

}
