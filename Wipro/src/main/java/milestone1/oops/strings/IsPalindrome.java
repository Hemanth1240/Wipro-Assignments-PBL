/*
 * Check String is Palindrome
 */

package milestone1.oops.strings;

import java.util.Scanner;
public class IsPalindrome {
	public boolean isPalindrome(String input1) {
		int len = input1.length();
		input1 = input1.toLowerCase();
		for (int i = 0; i < len / 2; i++) {
			if (input1.charAt(i) != input1.charAt(len - i - 1))
				return false;
			}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input String: ");
		String input1 = sc.next();
		IsPalindrome ip = new IsPalindrome();
		if(ip.isPalindrome(input1))
			System.out.println(input1 + " is a Palindrome");
		else
			System.out.println(input1 + " is not a Palindrome");
		sc.close();
	}

}


//----------------- P. Hemanth 21K61A1240