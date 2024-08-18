/*
 *  Given a string, if the first or last chars are 'x',
 *   return the string without those 'x' chars, otherwise return the string unchanged. 

If the input is "xHix", then output is "Hi".
If the input is "America", then the output is "America"
 */
package milestone1.oops.strings;
import java.util.Scanner;
public class RemoveX {
	public String removeX(String input1) {
		if(input1.charAt(0) == 'x' && input1.charAt(input1.length()-1) == 'x')
			return input1.substring(1, input1.length()-1);
		return input1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveX rx = new RemoveX();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input String: ");
		String input1 = sc.next();
		System.out.println("Resultant Output: " + rx.removeX(input1));
		sc.close();
	}

}
