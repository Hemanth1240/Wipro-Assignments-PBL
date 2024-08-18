package milestone1.metils.day8;
import java.util.Scanner;
public class DigitSum {
	public int digitSum(int input1) {
		int sum=0, neg=0;
        if(input1<0){
            input1*=-1;
            neg=1;
        }
        while(true){
            sum=0;
            while(input1>0){
                sum+=input1%10;
                input1/=10;
            }
            if(sum<10)
                break;
            else
                input1 = sum;
        }
        if(neg == 1)
            return sum*-1;
        return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DigitSum ds = new DigitSum();
		System.out.print("Enter number: ");
		int input1 = sc.nextInt();
		System.out.println("Digit Sum for "+ input1 + " is " + ds.digitSum(input1));
		sc.close();
	}

}
