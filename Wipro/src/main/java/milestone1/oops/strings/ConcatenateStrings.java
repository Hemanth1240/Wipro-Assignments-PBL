/*Write a java program that will concatenate 2 strings and return the result. 
The result should be in lowercase.

Note:If the concatenation creates a double-char, then one of the characters need to be omitted.

Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar

Example2)
i/p:Mark,kate
o/p:markate
*/
package milestone1.oops.strings;

import java.util.Scanner;
public class ConcatenateStrings {
	public String concatenateStrings(String input1, String input2) {
		String result = "";
		int n = input1.length();
		if(input1.charAt(n-1) == input2.charAt(0))
			result = input1.substring(0, n-1)+ input2;
		else
			result = input1 + " " + input2;
		return result.toLowerCase();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcatenateStrings cs = new ConcatenateStrings();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input Strings: ");
		String input1 = sc.next();
		String input2 = sc.next();
		sc.close();
		System.out.println("Concatenated String is " + cs.concatenateStrings(input1, input2));
		
	}

}


//------------------- P. Hemanth 21K61A1240