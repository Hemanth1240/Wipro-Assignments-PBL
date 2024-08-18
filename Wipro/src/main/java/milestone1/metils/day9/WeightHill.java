package milestone1.metils.day9;

public class WeightHill {
	public int weightHill(int input1, int input2, int input3) {
		int count=input1;
		input1=input1+input3;
		for(int i=2; i<= input2; i++) {
			count+= (i*input1);
			input1 += input3;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeightHill wh = new WeightHill();
		int input1 = Integer.valueOf(args[0]), input2 = Integer.valueOf(args[1]);
		int input3 = Integer.valueOf(args[2]);
		System.out.println("Value at " + input2 + " for head value as " +input1 + " is " + wh.weightHill(input1, input2, input3));
		
	}

}
