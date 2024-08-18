package milestone1.metils.day5;
import java.util.Scanner;
public class CountEvens {
	public int countEvens(int input1, int input2, int input3, int input4, int input5) {
		int count=0;
		if(input1%2==0)
            count+=1;
        if(input2%2==0)
            count+=1;
        if(input3%2==0)
            count+=1;
        if(input4%2==0)
            count+=1;
        if(input5%2==0)
            count+=1;
        return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input1, input2, input3, input4, input5;
		CountEvens ce = new CountEvens();
		System.out.print("Enter 5 numbers: ");
		input1=sc.nextInt();
		input2=sc.nextInt();
		input3=sc.nextInt();
		input4=sc.nextInt();
		input5=sc.nextInt();
		System.out.println("Total number of evens among given numbers are "+ce.countEvens(input1, input2, input3, input4, input5));
		sc.close();
	}

}
