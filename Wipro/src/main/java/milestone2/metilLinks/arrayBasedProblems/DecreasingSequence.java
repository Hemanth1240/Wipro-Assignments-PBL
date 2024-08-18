package milestone2.metilLinks.arrayBasedProblems;
import java.util.Scanner;
public class DecreasingSequence {
	public class Result{
		int output1;
		int output2;
		public Result(int op1, int op2) {
			output1 = op1;
			output2 = op1;
		}
	}
	public Result decreasingSequence(int input1[], int input2) {
		boolean flag = false;
		int nodcr = 0, longlen = 0, dcrcount = 0;
		for(int i = 0; i < input2 - 1; i++) {
			if(input1[i] > input1[i+1]) {
				if(!flag) {
					flag = true;
					nodcr++;
				}
				dcrcount++;
				if(dcrcount > longlen)
					longlen = dcrcount;
			}
			else {
				if(flag) {
					flag = false;
					dcrcount = 0;
				}
				
			}
		}
		if(longlen != 0)
			longlen++;
		return new Result(nodcr, longlen);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements ");
		int input2 = sc.nextInt(), input1[] = new int[input2];
		System.out.print("Enter Array elements: ");
		for(int i = 0; i < input2; i++)
			input1[i] = sc.nextInt();
		DecreasingSequence ds =new DecreasingSequence();
		Result r = ds.decreasingSequence(input1, input2);
		System.out.println("There are " + r.output1 + " longest decresing "
				+ "sequences\nAmong that highest sequence length is " +r.output2);
		sc.close();
	}

}
