package milestone1.metils.day9;
import java.lang.Math;
public class CreatePin {
	public int createPin(int input1, int input2, int input3) {
		int max = Integer.MIN_VALUE, min, count = 0, pin =0;
		while(input1 > 0) {
			min = input1%10;
			if(input1%10 > max)
				max = input1%10;
			if(min > input2%10)
				min = input2%10;
			if(input2%10 > max)
				max = input2%10;
			if(min > input3%10)
				min = input3%10;
			if(input3%10 > max)
				max = input3%10;
			input1/=10;
			input2/=10;
			input3/=10;
			pin += (min * (int)Math.pow(10, count));
			count++;
			
		}
		return (pin + (max* (int)Math.pow(10, count)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = Integer.valueOf(args[0]), input2 = Integer.valueOf(args[1]);
		int input3 = Integer.valueOf(args[2]);
		CreatePin cp = new CreatePin();
		System.out.println("Pin generated using " + input1 + ", " + input2 + " and "+ input3 + " is " + cp.createPin(input1, input2, input3));
	}

}
