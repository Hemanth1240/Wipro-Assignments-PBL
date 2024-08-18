package milestone1.metils.day5;
import java.util.Scanner;
public class MultipleM {
	public int isMultiple(int input1, int input2) {
		// TODO Auto-generated method stub
		if(input1==0 || input2 == 0)
			return -1;
		if(input1<0)
			input1*=-1;
		if(input2<0)
			input2*=-1;
		if(input1%input2 == 0)
			return 2;
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		MultipleM mm =new MultipleM();
		int input1,input2;
		System.out.print("Enter 2 values: ");
		input1=sc.nextInt();
		input2=sc.nextInt();
		int flag=mm.isMultiple(input1, input2);
		if(flag == 2)
			System.out.println(input1+" is multiple of "+input2);
		else if(flag==-1)
			System.out.println("Please enter non zero number");
		else
			System.out.println(input1+" is not a multiple of "+input2);
		sc.close();
	}

	

}
