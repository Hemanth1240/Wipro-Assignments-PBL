/*
 *  Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on. 
Any characters left, will go to the end of the result.

Example1)
i/p:Hello,World
o/p:HWeolrllod
 */
package milestone1.oops.strings;
import java.util.Scanner;
public class AlternateSequence {
	public String alternateSequenc(String input1, String input2) {
		String ss, ls;
		if(input1.length() > input2.length()) {
			ss=input2;
			ls=input1;
		}
		else {
			ls=input2;
			ss=input1;
		}
		String res="";
		for(int i =0; i<ss.length(); i++) {
			res += input1.charAt(i);
			res += input2.charAt(i);
		}
			
		res += ls.substring(ss.length(), ls.length());
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AlternateSequence as = new AlternateSequence();
		System.out.print("Enter input Strings: ");
		String input1 = sc.next(), input2 = sc.next();
		sc.close();
		System.out.println("Reusltant output: " + as.alternateSequenc(input1, input2));
	}

}

//-------------------------- P. Hemanth 21K61A1240
