package milestone2.metilLinks.arrayBasedProblems;
import java.util.Scanner;
public class MostFrequentlyOccurringDigit {
	public int mostFrequentlyOccurringDigit(int[] input1,int input2) {
		int count[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for(int num: input1) {
			while(num > 0) {
				count[num%10]++;
				num /= 10;
			}
		}
		int maxi = 0, max = 0;
		for(int i = 0; i <= 9; i++) {
			if(count[i] > max) {
				max = count[i];
				maxi = i;
			}
		}
		return maxi;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numbers: ");
		
		sc.close();
	}

}
