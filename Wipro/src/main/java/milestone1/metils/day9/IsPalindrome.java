
package milestone1.metils.day9;

public class IsPalindrome {
	public int isPalindrome(int input1) {
		int num2 = 0, num1 = input1;
		while(num1 > 0) {
			num2 = num2 * 10 + num1%10;
			num1/=10;
		}
		if(input1 == num2)
			return 2;
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = Integer.valueOf(args[0]);
		IsPalindrome ip = new IsPalindrome();
		if(ip.isPalindrome(input1) == 2) {
			System.out.println(input1+ " is Palindrome Number.");
		}
		else {
			System.out.println(input1 + " is not a palindrome number.");
		}
		
	}

}
