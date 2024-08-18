/*Given 2 strings, a and b, return a new string of the form short+long+short, 
with the shorter string on the outside and the longer string on the inside.

The strings will not be the same length, but they may be empty (length 0).

If input is "hi" and "hello", then output will be "hihellohi".
*/
package milestone1.oops.strings;
import java.util.Scanner;
public class ShortLong {
	public String shortLong(String input1, String input2) {
		if(input1.length()>input2.length())
			return input2+input1+input2;
		return input1+input2+input1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ShortLong sl = new ShortLong();
		System.out.print("Enter input Strings: ");
		String input1 = sc.next(), input2 = sc.next();
		System.out.println("Resultant Ouptut: " + sl.shortLong(input1, input2));
		sc.close();
	}

}

//------------------ P. Hemanth 21K61A1240
