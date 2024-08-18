/*
 *  Given a string, return a new string made of 'n' copies of the first 2 chars 
 *  of the original string where 'n' is the length of the string.

Example1)
i/p:Wipro
o/p:WiWiWiWiWi
 */
package milestone1.oops.strings;
import java.util.Scanner;
public class NCopiesChars {
	public String nCopiesChars(String input1) {
		String f2 = input1.substring(0, 2), res = "";
		for(int i = 0; i<input1.length(); i++) {
			res += f2;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		NCopiesChars ncc = new NCopiesChars();
		System.out.print("Enter Input String: ");
		String input1 = sc.next();
		System.out.println("Result String for " + input1 + " is " + ncc.nCopiesChars(input1));
		sc.close();
	}

}
