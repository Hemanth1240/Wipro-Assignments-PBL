package milestone1.metils.day6;
import java.util.Scanner;
public class NthPrime {
	public int nthPrime(int input1) {
		// TODO Auto-generated method stub
		if(input1 == 1)
            return 2;
        int prime=3, nonprime=3, i=2;
        while(i<=(input1+1)){
            int nof=0;
            for(int j=2; j<nonprime/2; j++){
                if(nonprime%j == 0)
                {
                    nof=1;
                    break;
                }
            }
            if(nof == 0){
                i++;
                prime = nonprime;
            }
            nonprime++;
        }
        return prime;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		NthPrime np = new NthPrime();
		System.out.print("Enter n value: ");
		int input1 = sc.nextInt();
		System.out.println(input1 + "th Prime is " + np.nthPrime(input1));
		sc.close();
	}

	

}
