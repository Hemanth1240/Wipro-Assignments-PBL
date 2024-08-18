package milestone1.metils.day9;

public class IsPalindromePossible {
	public int isPalindromePossible(int input1) {
		int count[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		while(input1 > 0) {
			count[input1%10] += 1;
			input1/=10;
		}
		int ocount = 0;
		for (int i : count) {
			if( i % 2 != 0)
				ocount++;
		}
		if(ocount <= 1)
			return 2;
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = Integer.valueOf(args[0]);
		IsPalindromePossible ipp = new IsPalindromePossible();
		if(ipp.isPalindromePossible(input1) == 2)
			System.out.println(input1 + " can be represented as Palindrme number after rearraing the digits");
		else
			System.out.println(input1 + " cannot be represented as Palindrme number after rearraing the digits");
	}

}
