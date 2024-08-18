/*
 * Write a Java program that accepts a string (with * in it).
 * The program should return a new string in which 
 * the following characters are removed-*,
 * the characters that are to the left and right of *

Example1)
i/p:ab*cd
o/p:ad
 */
package milestone1.oops.strings;
import java.util.Scanner;
public class RemoveBeforeAndAfter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		
		String[] stars = str.split(".[\\*]+.");
		
		StringBuffer sb = new StringBuffer();
		
		for (String x : stars)
			sb.append(x);
		
		System.out.println(sb);
		sc.close();
	}

}


//--------------- P. Hemanth 21K61A1240