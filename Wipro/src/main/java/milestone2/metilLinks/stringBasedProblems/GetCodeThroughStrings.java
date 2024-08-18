/*
 * For example, if the string is “Wipro Technologies",
 *  the numeric PIN will be 8.
Explanation:
Length of the word “Wipro” = 5
Length of the word “Technologies” = 12
Let us add all the lengths to get the Total Length = 5 + 12 = 17
The Total Length = 17 , which is not a single-digit,
 so now let us continuously add all digits till we get a single digit i.e. 1+ 7 = 8
Therefore, the single-digit numeric PIN = 8
 */
package milestone2.metilLinks.stringBasedProblems;

public class GetCodeThroughStrings {
	public int getCodeThroughStrings(String input1) {
		String words[] = input1.split(" ");
		int sum = 0;
		for(String word: words)
			sum += word.length();
		return (1 + (sum-1)%9);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetCodeThroughStrings gcts = new GetCodeThroughStrings();
		System.out.println(gcts.getCodeThroughStrings("Wipro Technologies"));
	}

}
