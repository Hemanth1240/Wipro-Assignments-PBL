/*
 *  Initialize a character variable with an alphabhet in a program.

	If the character value is in lowercase, the output should be displayed in uppercase
	in the following format.
 * 
 */

package milestone1.javafundamentals.flowControl;
import java.util.Scanner;
public class ChangingCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		sc.close();
		int val = (int)c;
		if (val>=65 && val<=91)
			c = (char)(97 + (val-65));
		else
			c=(char)(65+val-97);
		System.out.println(c);
	}

}
