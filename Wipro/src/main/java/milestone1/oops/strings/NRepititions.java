/*
 * Given a string and an integer n, 
 * print a new string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive. 

Example1)
i/p:Wipro,3
o/p:propropro
 */
package milestone1.oops.strings;
import java.util.Scanner;
public class NRepititions {
	public String nRepititions(String input1, int n) {
		String substr = input1.substring(input1.length()-n);
		String res="";
		for(int i = 0; i < n; i++)
			res += substr;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		NRepititions nr = new NRepititions();
		System.out.print("Enter input String and n value: ");
		String input1 = sc.next();
		int n = sc.nextInt();
		System.out.println("Resultant output: " + nr.nRepititions(input1, n));
		sc.close();
	}

}

//------------------------- P. Hemanth 21K61A1240