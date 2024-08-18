package milestone1.metils.day7;
import java.util.Scanner;
public class NonRepeatedDigitsCount {
	public int nonRepeatedDigitsCount(int input1) {
		int count1[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int count=0;
        while(input1>0){
            count1[input1%10]++;
            input1/=10;
        }
        for(int i=0; i<=9; i++){
            if(count1[i] == 1)
                count++;
        }
        return count;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		NonRepeatedDigitsCount nrdc = new NonRepeatedDigitsCount();
		System.out.print("Enter number: ");
		int input1 = sc.nextInt();
		System.out.println("Number of non repeated digits " + nrdc.nonRepeatedDigitsCount(input1));
		sc.close();
	}

}
