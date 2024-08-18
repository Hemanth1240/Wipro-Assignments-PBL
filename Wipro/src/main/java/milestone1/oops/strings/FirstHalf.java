/*
 *  Write a java program that will return the first half of the string,
 *  if the length of the string is even. It should return null for odd length string.

Example1)
i/p:TomCat
o/p:Tom

Example2)
i/p:Apron
o/p:null
 */
package milestone1.oops.strings;
import java.util.Scanner;
public class FirstHalf {
	public String firstHalf(String input1) {
		if(input1.length()%2 != 0)
			return null;
		String res = input1.charAt(0)+"";
		for(int i =1; i<input1.length(); i++) {
			if(Character.isUpperCase(input1.charAt(i)))
				return res;
			res += input1.charAt(i); 
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstHalf fh = new FirstHalf();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Input String: ");
		String input1 = sc.next();
		System.out.println("Result Ouput is " + fh.firstHalf(input1));
		sc.close();
	}
}

//---------------------------- P. Hemanth 21K61A1240
