/*
 * If input strings are “1234” and “56”, the output string should be “1290”
If input strings are “56” and “1234”, the output string should be “1290”
If input strings are “123456732128989543219” and “987612673489652”, 
the output string should be “123457719741663032871”
 */
package milestone2.metilLinks.stringBasedProblems;
import java.util.Scanner;
public class AdditionUsingStrings {
	public String additionUsingStrings(String input1, String input2) {
		int carry = 0;
		if(input1.length() < input2.length()) {
			String temp = input1;
			input1 = input2;
			input2 = temp;
		}
		int len1 = input1.length(), len2 = input2.length();
		int a, b;
		int j = len2 - 1, sum;
		String res = "";
		for(int i = len1 - 1; i >= 0; i--) {
			a = Character.getNumericValue(input1.charAt(i));
			b = 0;
			if(j >= 0) {
				b = Character.getNumericValue(input2.charAt(j));
				j--;
			}
			sum = a + b + carry;
			carry = sum / 10;
			res = String.valueOf(sum % 10) + res;
		}
		if(carry > 0)
			res = String.valueOf(carry) + res;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AdditionUsingStrings aus = new AdditionUsingStrings();
		System.out.print("Enter both inputs: ");
		String input1 = sc.next(), input2 = sc.next();
		System.out.println("Result: " + aus.additionUsingStrings(input1, input2));
		sc.close();
	}

}
