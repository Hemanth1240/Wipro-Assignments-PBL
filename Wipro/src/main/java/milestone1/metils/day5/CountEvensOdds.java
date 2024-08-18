package milestone1.metils.day5;
import java.util.Scanner;
public class CountEvensOdds {
	public int countEvensOdds(int input1, int input2, int input3, int input4, int input5, String input6) {
		int ecount=0, ocount=0;
		if(input1%2==0)
            ecount+=1;
        else
            ocount+=1;
        if(input2%2==0)
            ecount+=1;
        else
            ocount+=1;
        if(input3%2==0)
            ecount+=1;
        else
            ocount+=1;
        if(input4%2==0)
            ecount+=1;
        else
            ocount+=1;
        if(input5%2==0)
            ecount+=1;
        else
            ocount+=1;
        if(input6.equals("even"))
            return ecount;
        return ocount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountEvensOdds ceo = new CountEvensOdds();
		Scanner sc = new Scanner(System.in);
		int input1, input2, input3, input4, input5;
		String input6;
		System.out.print("Enter 5 values: ");
		input1=sc.nextInt();
		input2=sc.nextInt();
		input3=sc.nextInt();
		input4=sc.nextInt();
		input5=sc.nextInt();
		System.out.print("Enter Even or Odd: ");
		input6=sc.next();
		System.out.println("Total "+input6+"s are "+ceo.countEvensOdds(input1, input2, input3, input4, input5, input6));
		sc.close();
	}

}
